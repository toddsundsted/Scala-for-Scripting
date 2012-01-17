package scripting.file

import java.io.File

class FileBuilder(val file: File) {

  def f = this

  def << = new java.io.FileOutputStream(this.file)

  def >> = new java.io.FileInputStream(this.file)

  override def toString = file.toString
}
