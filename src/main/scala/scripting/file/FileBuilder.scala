package scripting.file

import java.io.File

class FileBuilder(val file: File) {

  def f = this

  def << = new java.io.FileOutputStream(file)

  def >> = new java.io.FileInputStream(file)

  override def toString = file.toString
}
