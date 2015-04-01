var SampleViewModel_Extend = {
    doAction: function (name, viewModel) {
        if (this[name])
            this[name](viewModel);
    },
    textAction: function (viewModel, args) {
        /// <param name="viewModel" type="SampleViewModel">viewModel类型为SampleViewModel</param>
	//alert(args.id);
        alert(viewModel.getmyTextBox().getValue());
    },
    ListInitDataAction:function(viewModel, args){
			//alert(viewModel.getmyTextBox().getValue());
			var data = [];
			var curIndex = 0;
			for ( i = 0; i < 1000; i++) {
				data[i] = {};
				data[i].name = "name排名第" + (i + 1) + "位";
				data[i].href = "#";
				data[i].value = "value排名第" + (i + 1) + "位";
				data[i].text = "text排名第" + (i + 1) + "位";
			}
//alert("werqwerqw111e");
		//viewModel.fields["ListInitDataAction"].set("setDataSource",data);//setDataSource(data);
viewModel.getListInitDataAction().setDataSource(data);
//viewModel.getListInitDataAction().setValue("1231");
	}
};
