'use strict';

var myApp = angular.module('myApp', ['ngRoute']);

myApp.config(function ($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl: "search.html",
            controller: "searchController"
        })
        .when("/search", {
            templateUrl: "search.html",
            controller: "searchController"
        })
        .when("/searchGeo", {
            templateUrl: "searchGeo.html",
            controller: "searchGeoController"
        })
        .when("/postTweet", {
            templateUrl: "postTweet.html",
            controller: "postController"
        })
        .when("/trends", {
            templateUrl: "trends.html",
            controller: "trendsController"
        })
        .when("/directMessage", {
            templateUrl: "directMessage.html",
            controller: "directMessageController"
        })
        .when("/getFollowers", {
            templateUrl: "getFollowers.html",
            controller: "getFollowersController"
        })
        .when("/getRetweetsOfMe", {
            templateUrl: "getRetweetsOfMe.html",
            controller: "getRetweetsOfMeController"
        })
        .when("/timeline", {
            templateUrl: "timeline.html",
            controller: "timelineController"
        });
});

myApp.controller('searchController', function () {
    console.log('searchController starting');
});

myApp.controller('searchGeoController', function ($scope) {
    console.log('searchGeoController starting');
});

myApp.controller('postController', function ($scope) {
    console.log('postController starting');
});

myApp.controller('trendsController', function ($scope) {
	getTrends();
    console.log('trendsController starting');
});

myApp.controller('directMessageController', function ($scope) {
    console.log('directMessageController starting');
});

myApp.controller('timelineController', function ($scope) {
	getTimeline();
    console.log('timelineController starting');
});

myApp.controller('getFollowersController', function ($scope) {
    console.log('getFollowersController starting');
});

myApp.controller('getRetweetsOfMeController', function ($scope) {
	getRetweetsOfMe();
    console.log('getRetweetsOfMeController starting');
});