package scripting

import java.io.File

package object file {

  implicit def string2filebuilder(string: String): FileBuilder = new FileBuilder(new File(string))

  implicit def filebuilder2file(fileBuilder: FileBuilder): File = fileBuilder.file
}
