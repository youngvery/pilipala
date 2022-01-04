# pilipala
基于testng+allure+rest-assured的接口自动化解决方案（噼里啪啦）
GitHub：https://github.com/youngvery/pilipala

在IDEA的Terminal里执行如下命令：
先执行测试mvn test，完成后执行如下命令
.\allure\bin\allure serve .\target\allure-results\
allure下载地址（下载后解压到当前项目pilipala下，我这边下载2.15.0的，可根据需要自行下载版本）：https://github.com/allure-framework/allure2/releases/download/2.17.2/allure-2.17.2.zip

TODO：暂时生成的报告还有问题，因为测试数据分离的原因导致，后续优化（已解决Done）
非问题，是Allure使用了DataProvider里的内容作为allure里一个用例的标识，所以改了就相当于一个新的用例
TODO：集成至Jenkins的步骤
