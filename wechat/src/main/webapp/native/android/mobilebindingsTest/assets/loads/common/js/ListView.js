﻿/// <reference path="../Control.js" />
cb.controls.widget("ListView", function (controlType) {
    var control = function (id, options) {
        cb.controls.Control.call(this, id, options);
    };
    control.prototype = new cb.controls.Control();
    control.prototype.controlType = controlType;

    control.prototype.getValue = function () {
        if (this.getElement().is("a"))
            return this._get_data("title");
        else
            return this.getElement().html();
    };

    control.prototype._href = function () {
        this._get_data("href");
    };
   //设置数据-begin
    control.prototype.setDataSource = function (data) {
        for (var i = 0; i < data.length; i++) {
            var value = data[i].value;
            var text = data[i].text;
            var $li = '<li><a href="#"><span><img src="img/tab_home_touch.png" class="ui-li-icon ui-corner-none" ></span><span>' + text + '</span></a></li>';
            this.getElement().children().last().append($li); 
        }
        $(this.getElement().children()).listview('refresh');
    };
  //设置数据-end
    control.prototype.setValue = function (val) {
        if (val == "") return;
        this.getElement().is("a") ? this._set_data("title", val) : this.getElement().html(val);
    };

    control.prototype.setVisible = function (val) {
        val ? this.getElement().show() : this.getElement().hide();

        this.getElement().trigger("afterSetVisible", val);
    };

    control.prototype.setReadOnly = function (val) { };

    control.prototype.on = function (eventName, func, context) {
        var me = this;
        if (eventName.indexOf("on") == 0)
            eventName = eventName.substr(2);
        this.getElement().on(eventName, function (e, args) {
            func.call(context, me.getValue());
        });
    };

    control.prototype.setData = function (data) {
        for (var attr in data) {
            var attrUpper = attr.substring(0, 1).toUpperCase() + attr.substring(1);
            if (this["set" + attrUpper]) this["set" + attrUpper](data[attr]);
        }
    };

    control.prototype.setHotKey = function (key) {
        var self = this;
        this.getElement().on("keydown", function (e) {
            e = e || window.event;
            if (e.altKey) {
                var keyCode = e.keyCode || e.which;
                if (String.fromCharCode(keyCode) == key) {
                    self.getElement().focus();
                }
            }
        });
    };

    return control;
});