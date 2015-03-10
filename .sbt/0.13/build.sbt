addCommandAlias("fullBuild", ";clean;compile;test;publishLocal;publishM2")

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource
EclipseKeys.useProjectId := true
EclipseKeys.withSource := true
EclipseKeys.withBundledScalaContainers := false

