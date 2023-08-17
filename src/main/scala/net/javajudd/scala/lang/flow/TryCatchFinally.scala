package net.javajudd.scala.lang.flow

import java.io.{File, FileWriter, IOException}

object TryCatchFinally extends App {
  try {
    writeToFile("/tmp/hello.txt", "Hello World")
  } catch {
    case ioe: IOException => println(s"IOException thrown: ${ioe.getMessage}")
    case nfe: NumberFormatException => println(s"NumberFormatException thrown: ${nfe.getMessage}")
  } finally {
    println("Clean up your resources here.")
  }

  private def writeToFile(filename: String, contents: String): Unit = {
    //throw new IOException("Catastrophic IOException")
    val fileWriter = new FileWriter(new File(filename))
    fileWriter.write(contents)
    fileWriter.close()
  }
}
