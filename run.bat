set projectLocation=D:\Eclipse_WorkSpace\Day_MFW_016
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
