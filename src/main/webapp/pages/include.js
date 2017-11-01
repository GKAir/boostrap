$(function () {
    var header = document.createElement("div");
    header.setAttribute("class", "navbar-default navbar-static-side");
    header.setAttribute("role", "navigation");
    header.innerHTML = "<jsp:include page=\"header.html\"/>";

    var left = document.createElement("nav");
    left.setAttribute("id", "page-wrapper");
    left.setAttribute("class", "gray-bg dashbard-1");
    left.innerHTML = "<jsp:include page=\"leftSide.html\"/>";
    //把div元素节点添加到body元素节点中成为其子节点，但是放在body的现有子节点的最后
    document.body.appendChild(header);
    document.body.appendChild(left);
    //插入到最前面
    document.body.insertBefore(header, document.body.firstElementChild);
    document.body.insertBefore(left, document.body.firstElementChild);
});