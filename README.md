# pilipala
基于testng+allure+rest-assured的接口自动化解决方案（噼里啪啦）
GitHub：https://github.com/youngvery/pilipala

先执行测试case，然后在IDEA的Terminal里执行如下命令：
allure serve ./allure-results

TODO：暂时生成的报告还有问题，因为测试数据分离的原因导致，后续优化（已解决）
非问题，是Allure使用了DataProvider里的内容作为allure里一个用例的标识，所以改了就相当于一个新的用例
