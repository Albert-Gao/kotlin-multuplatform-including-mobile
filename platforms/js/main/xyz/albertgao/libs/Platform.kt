package xyz.albertgao.libs

actual class Platform actual constructor(
  private val url: String
) {
  actual fun get():String {
    return "Kotlin-JS $url"
  }
}