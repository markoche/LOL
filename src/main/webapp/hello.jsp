<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery_dev.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<style type="text/css">
li{
  list-style-type:lower-alpha;
}
#a1{
	width:100px;
	height:100px;
	background:red;
	position:relative;
	animation:myfirst 30s;
	-webkit-animation:myfirst 30s; /* Safari and Chrome */
}

#td td{
    text-align:center;
    vertical-align:middle;
}
#td th{
    text-align:center;
    vertical-align:middle;
}
#show{
    width:100%;
    height:500px;
    margin-left:400px;
}
#choose{
    width:100%;
    height:auto;
}
#kk{
    width:100%;
    height:aotu;
  
}
</style>
<script src="js/jquery_dev.js"></script>
</head>
<body>

<div style="margin-left:400px;margin-top:100px;">
<form action="findNameHero">
姓名 <input type="text" name="name" id="hname" style="width:200px float:left;" placeholder="可输入关键字查询">
  <button type="submit" id="search" class="btn btn-default">查询</button>
  <button type="button" id="add" class="btn btn-success">添加</button>
</form>
   
</div>
 <script>
 $("#add").click(function(){
	
	   $.get("regist.jsp",{},function(){
		   window.self.location = "regist.jsp";
	   });
});
 
 </script>
<div id="show">
<table class="table table-hover" id="td" style="width:1500px;">
<tr>
<th>英雄编号</th>
<th>图像</th>
<th>姓名</th>
<th>别名</th>
<th>性别</th>
<th>第一职业</th>
<th>第二职业</th>
<th>技能Q</th>
<th>技能W</th>
<th>技能E</th>
<th>技能R</th>
<th>被动</th>
<th>出生日期</th>
<th></th>
<th></th>
</tr>
<c:forEach items="${hero}" var="hero">
<tr>
<td>${hero.id}</td>
<td><img style="height:60px" src="${hero.img}"/></td>
<td>${hero.name}</td>
<td>${hero.nickname}</td>
<td>${hero.sex}</td>
<td>${hero.first}</td>
<td>${hero.second}</td>
<td>${hero.q}</td>
<td>${hero.w}</td>
<td>${hero.e}</td>
<td>${hero.r}</td>
<td>${hero.passivity}</td>
<td>${hero.birthday}</td>
<td> <button type="button" id="s${hero.id }" class="btn btn-success " >删除</button></td>
<td><a  href="${pageContext.request.contextPath}/findHero?id=${hero.id}">修改</a></td>
</tr>
<script>
 $("#s${hero.id}").click(function(){
	var id=${hero.id};
	 $.get("delHero",{id:id},function(){
		 location.reload();
	   });
	  
});
 
 </script>
</c:forEach>
</table>

<div style="margin-left:150px;">
 <c:if test="${curr>1 }">
        <a href="${pageContext.request.contextPath }/getpageHero?page=${page-1}"><button type="button" class="btn btn-default">上一页</button></a>
    </c:if>
        <a href="${pageContext.request.contextPath }/getpageHero?page=${1}"><button type="button" class="btn btn-default">首页</button></a>
            <c:forEach begin="1" end="${maxPage }" step="1" var="i">
                <c:if test="${page==i }">
                    <a href="${pageContext.request.contextPath }/getpageHero?page=${i}"><font color="#ff0000">${i}</font></a>
                </c:if>
                <c:if test="${page!=i }">
                    <a href="${pageContext.request.contextPath }/getpageHero?page=${i}"><font >${i}</font></a>
                </c:if>
            </c:forEach>
            <a style="font-size:16px;text-decoration:none;color:black;">共有页${maxPage}页 -向</a><input type="text" id="pageNum" style="width:35px;height:30px;margin-right:10px;"/><button type="button" class="btn btn-success" onclick="toChange()">跳转</button>
        <a href="${pageContext.request.contextPath }/getpageHero?page=${maxPage}"><button type="button" class="btn btn-default">末页</button></a>
    <c:if test="${page< maxPage }">
        <a href="${pageContext.request.contextPath }/getpageHero?page=${page+1}"><button type="button" class="btn btn-default">下一页</button></a>
    </c:if>
</div>

</div>



</body>
</html>