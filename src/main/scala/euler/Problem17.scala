package euler

import euler.tools.TextVersion

object Problem17 {
  def toText (number: Int): String = {
    TextVersion.of(number)
  }

  def solution (limit: Int): Int = {
    1 to limit flatMap { TextVersion.of } count { c => !(c == ' ' || c == '-') }
  }
}
