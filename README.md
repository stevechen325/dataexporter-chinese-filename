# dataexporter-chinese-filename
primefaces 6.2 匯出中文檔名問題及解決方式

![image](https://github.com/stevechen325/dataexporter-chinese-filename/blob/master/image.png)

下載檔名是

Content-disposition: attachment;filename="%25E4%25B8%25AD%25E6%2596%2587%25E6%25AA%2594%25E5%2590%258D.xls"; filename*=UTF-8''%25E4%25B8%25AD%25E6%2596%2587%25E6%25AA%2594%25E5%2590%258D.xls

看起來像是被編碼了兩次