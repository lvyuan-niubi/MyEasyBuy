<%-- 管理员 分类管理--%>
<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <link type="text/css" rel="stylesheet" href="css/style.css" />
  <!--[if IE 6]>
  <script src="js/iepng.js" type="text/javascript"></script>
  <script type="text/javascript">
    EvPNG.fix('div, ul, img, li, input, a');
  </script>
  <![endif]-->
</head>
<body>

<jsp:include page="/Struct/Head.jsp"></jsp:include>
<jsp:include page="/Struct/Search.jsp"></jsp:include>

<!--End Header End-->
<div class="i_bg bg_color">
  <!--Begin 用户中心 Begin -->
  <div class="m_content">

    <jsp:include page="/Struct/Left.jsp"></jsp:include>

    <div class="m_right" id="content">
      <div class="mem_tit">分类列表</div>
      <p align="right">
        <a href="javascript:void(0);" onclick="toAddProductCategory();" class="add_b">添加分类</a>
        <br>
      </p>
      <br>
      <table border="0" class="order_tab" style="width:930px; text-align:center; margin-bottom:30px;" cellspacing="0" cellpadding="0">
        <tbody>
        <tr>
          <td width="5%">选择</td>
          <td width="20%">分类名称</td>
          <td width="25%">分类级别</td>
          <td width="25%">父级分类</td>
          <td width="25%" >操作</td>
        </tr>
        <c:forEach items="${productCategoryList}" var="temp">
          <tr>
            <td width="5%"><input type="radio" value="${temp.id}" name="select" onclick="toUpdateProductCategoryList(this);"/></td>
            <td>${temp.name}</td>
            <td>
            <c:choose>
               <c:when test="${temp.type==1}">一级分类</c:when>
               <c:when test="${temp.type==2}">二级分类</c:when>
               <c:when test="${temp.type==3}">三级分类</c:when>
            </c:choose>
            </td>
            <td>
            <c:if test="${empty temp.parentName}">
            	无
            </c:if>
            <c:if test="${not empty temp.parentName}">
            	${temp.parentName}
            </c:if>
            </td>
            <td><a href="javascript:void(0);" onclick="deleteProductCategory(${temp.id},${temp.type});">删除</a></td>
          </tr>
        </c:forEach>
        </tbody>
      </table>

      <div id="addProductCategory">

      </div>
    </div>
  </div>

</div>
<jsp:include page="/Struct/Bottom.jsp"></jsp:include>
</body>
</html>


