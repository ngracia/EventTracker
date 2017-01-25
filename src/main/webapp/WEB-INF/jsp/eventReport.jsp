<%--
  Created by IntelliJ IDEA.
  User: dev
  Date: 25/01/17
  Time: 06:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!docType html>
<html ng-app>
    <head>
        <title>Hello Events Angular</title>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min"/>
        <script src="events.js"/>
    </head>
    <body>
        <div ng-controller="Events">
            I have {{events.length}} events!
            <ul class="events-container">
                <li ng-repeat = "event in events">
                    {{event.name}}
                </li>
            </ul>
        </div>
    </body>
</html>
