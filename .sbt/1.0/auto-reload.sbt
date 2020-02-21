Def.settings {
  try {
    val value = Class.forName("sbt.nio.Keys$ReloadOnSourceChanges$").getDeclaredField("MODULE$").get(null)
    val clazz = Class.forName("sbt.nio.Keys$WatchBuildSourceOption")
    val manifest = new scala.reflect.Manifest[AnyRef]{ def runtimeClass = clazz }
    Seq(
      SettingKey[AnyRef]("onChangedBuildSource")(manifest, sbt.util.NoJsonWriter()) in Global := value
    )
  } catch {
    case e: Throwable =>
      Nil
  }
}

