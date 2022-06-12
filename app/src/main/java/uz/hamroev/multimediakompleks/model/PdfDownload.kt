package uz.hamroev.multimediakompleks.model

class PdfDownload {

    var pdfUrl: String? = null
    var pdfName: String? = null


    constructor(pdfUrl: String?, pdfName: String?) {
        this.pdfUrl = pdfUrl
        this.pdfName = pdfName
    }
}