addCommandAlias("fullBuild", ";clean;compile;test;publishLocal;publishM2")

EclipseKeys.createSrc                  := EclipseCreateSrc.Source + EclipseCreateSrc.Resource
EclipseKeys.skipParents in ThisBuild   := false
EclipseKeys.useProjectId               := true
EclipseKeys.withSource                 := true
EclipseKeys.withBundledScalaContainers := false
