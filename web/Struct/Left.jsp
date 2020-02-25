<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/25
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="jquery-1.12.4.js"></script>
<script>
    $(document).ready(function(){
        $("a").click(function () {
             $("li a").attr("class","");
        });
    });
</script>

<div class="m_left">
    <div class="left_n">管理中心</div>
    <div class="left_m">
        <div class="left_m_t t_bg1">订单中心</div>
        <ul>
            <li><a href="AdminOrder.jsp">我的订单</a></li>
            <li><a href="Member_User.html">全部信息</a></li>
        </ul>
    </div>

    <div class="left_m">
        <div class="left_m_t t_bg2">会员中心</div>
        <ul>
            <li><a href="UserInfo.jsp">用户信息</a></li>
            <li><a href="UserHander/queryAllUser">用户列表</a></li>
        </ul>
    </div>

    <div class="left_m">
        <div class="left_m_t t_bg3">商品管理</div>
        <ul>
            <li><a href="ProductHander/CatagoryData/1">分类管理</a></li>
            <li><a href="Member_Packet.html">商品管理</a></li>
            <li><a href="Member_Money.html">商品上架</a></li>
        </ul>
    </div>

    <div class="left_m">
        <div class="left_m_t t_bg4">咨询中心</div>
        <ul>
            <li><a href="Member_Member.html">咨询列表</a></li>
            <li><a href="Member_Results.html">我的业绩</a></li>
            <li><a href="Member_Commission.html">我的佣金</a></li>
            <li><a href="Member_Cash.html">申请提现</a></li>
        </ul>
    </div>


</div>




