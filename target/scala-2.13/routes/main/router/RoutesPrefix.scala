// @GENERATOR:play-routes-compiler
// @SOURCE:/home/matheus/Documentos/projetos/playframework-playground/conf/routes
// @DATE:Wed Aug 07 06:25:45 BRT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
