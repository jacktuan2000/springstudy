var SampleViewModel = function (name) {
    cb.model.ContainerModel.call(this, null, name || "SampleViewModel");
    this.init();
};
SampleViewModel.prototype = new cb.model.ContainerModel();
SampleViewModel.prototype.constructor = SampleViewModel;
SampleViewModel.prototype.init = function () {
    var fields = {
        ViewModelName: "SampleViewModel",
        textAction: new cb.model.SimpleModel(),
		ListInitDataAction: new cb.model.SimpleModel(),
        myTextBox	: new cb.model.SimpleModel({ value: "MyTextBox111" })
    };
    this.setData(fields);
    this.setDirty(false);
    //this.gettextAction().on("click", function (args) { SampleViewModel_Extend.textAction(this.getParent(), args); });
    this.gettextAction().on("click", function (args) { SampleViewModel_Extend.ListInitDataAction(this.getParent(), args); });
    //this.initData();
};

SampleViewModel.prototype.initData = function () {
    SampleViewModel_Extend.doAction("init_Extend", this);
};
