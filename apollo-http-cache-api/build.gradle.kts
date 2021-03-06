plugins {
  `java-library`
  kotlin("jvm")
}

java {
  targetCompatibility = JavaVersion.VERSION_1_7
  sourceCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
  add("compileOnly", groovy.util.Eval.x(project, "x.dep.okHttp.okHttp"))

  add("api", groovy.util.Eval.x(project, "x.dep.kotlin.stdLib"))
  add("api", groovy.util.Eval.x(project, "x.dep.okio"))
}
