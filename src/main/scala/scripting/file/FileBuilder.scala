package scripting.file

import java.io.File

class FileBuilder(val file: File) {

  def f = this

  override def toString = file.toString
}

object Implicits {

  implicit def string2filebuilder(string: String): FileBuilder = new FileBuilder(new File(string))

  implicit def filebuilder2file(fileBuilder: FileBuilder): File = fileBuilder.file
}
