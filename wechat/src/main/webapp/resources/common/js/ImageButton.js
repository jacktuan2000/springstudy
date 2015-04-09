/// <reference path="../Control.js" />
cb.controls.widget("ImageButton", function (controlType) {
    var control = function (id, options) {
        cb.controls.Control.call(this, id, options);
    };
    control.prototype = new cb.controls.Button();
    control.prototype.controlType = controlType;

    control.prototype.getValue = function () {
        return this.getElement().children("span:last-Child").text();
    };

    control.prototype.setValue = function (val) {
        if (val == "") return;
        this.getElement().children("span:last-Child").text(val);
    };

    control.prototype.setVisible = function (val) {
        val ? this.getElement().show() : this.getElement().hide();
    };

    control.prototype.setModel = function (val) {
        switch (val) {
            case "no-image":
                this.getElement().children("span:first-child").css("display", "none");
                break;
            case "no-text":
                this.getElement().children("span:last-child").css("display", "none");
                break;
            case "image-text":
                this.getElement().children().css("display", "block");;
                break;
        }
    };

    control.prototype.on = function (eventName, func, context) {
        var me = this;
        if (eventName.indexOf("on") == 0)
            eventName = eventName.substr(2);
        this.getElement().on(eventName, function (e, args) {
            //if (this.getElement()) {
            //    this.getElement().style.border = "1px solid red";
            //} else {
            //    this.getElement().css("border", "1px solid red");
            // }
            //var sx = 0, sy = 0, cx = 0, cy = 0;
            $('#' + this.id)[0].addEventListener('touchstart', function (evt) {
                //当前位于屏幕上的所有手指列表中的第一个的坐标
                $('#' + this.id)[0].style.backgroundColor = "#E4E4E4";
            }, false);
            $('#' + this.id)[0].addEventListener('touchmove', function (evt) {
               
            }, false);
            $('#' + this.id)[0].addEventListener('touchend', function (evt) {
                $('#' + this.id)[0].style.backgroundColor = "#fff";
            }, false);
            //$('#' + this.id).css({ "transition": "background-color 2s", "-moz-transition": "background-color 2s", "-moz-transition": "background-color 2s", "-webkit-transition": "background-color 2s", "-o-transition": "background-color 2s" })
           // $('#' + this.id).css("background-color", "#E4E4E4");
            //console.log(this.id);
            func.call(context, me.getValue());
            //$('#' + this.id).css("background-color", "#fff");
            //$('#' + this.id).css("border", "1px solid #fff");
        });
    };
    return control;
});