
function validation() {
    var params = {};
    params.username = $("#inputUserName").val();
    params.password = $("#inputPassWord").val();
    $.ajax({
        type: "GET",
        url: "/Login/login",
        data: params,
        dataType: "json",
        success: function (data) {
            alert(data);
        },
        error: function (data) {
            alert(data)
        }
    })
}