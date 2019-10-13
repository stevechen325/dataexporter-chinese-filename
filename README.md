# dataexporter-chinese-filename
primefaces 6.2 匯出中文檔名問題及解決方式

![image](https://github.com/stevechen325/dataexporter-chinese-filename/blob/master/2019-10-13_142553.png)

下載檔名是

Content-disposition: attachment;filename="%25E4%25B8%25AD%25E6%2596%2587%25E6%25AA%2594%25E5%2590%258D.xls"; filename*=UTF-8''%25E4%25B8%25AD%25E6%2596%2587%25E6%25AA%2594%25E5%2590%258D.xls

看起來像是被編碼了兩次

經查看原始碼，在 DataExporter 與 ComponentUtils 各做一次編碼導致 % 被編碼兩次，故在不更版下，解決方式是讓 DataExporter 的編碼失敗，使其略過第一次編碼

![image](https://github.com/stevechen325/dataexporter-chinese-filename/blob/master/2019-10-13_144702.png)