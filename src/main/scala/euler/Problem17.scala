package euler

import euler.tools.TextVersion

object Problem17 {
  def toText (number: Int): String = {
    TextVersion.Of(number)
  }

  def solution (limit: Int): Int = {
    1 to limit flatMap { TextVersion.Of } count { c => !(c == ' ' || c == '-') }
  }
}
