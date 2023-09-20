package cmd

import java.io.{File, IOException}
import org.apache.pdfbox.Loader
import org.apache.pdfbox.text.{PDFTextStripper, TextPosition}
import lib.Greeting

object PDFExtractor {
  def extractTextFromPDF(input: Array[Byte]): String = {
    val document = Loader.loadPDF(input)
    val textStripper = new PDFTextStripper()
    textStripper.setSortByPosition(true)
    textStripper.setAddMoreFormatting(true)
    val text = textStripper.getText(document)
    document.close()
    text
  }
}
object Runner {
  def main(args: Array[String]) = {
    Greeting.sayHi
  }
}
