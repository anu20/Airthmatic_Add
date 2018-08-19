<jsp:useBean id="App" scope="page" class="com.simplilearn.training.Airthmatic_Add.App" /> // sample is java file name

String name1 = request.getParameter("text1");
String name2 = request.getParameter("text2");
int iRowAffected = 0;   

//-------now pass parameter "name" to your sample java file

App.examineInput(name1,name2);