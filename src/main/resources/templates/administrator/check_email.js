/**
 * 
 */

$(function() {
	$("#mailAddress").on("keyup", function() {
		var hostUrl = 'http://localhost:8080/check-email-api/emailcheck';
		var inputEmail = $("#mailAddress").val();

		$.ajax({
			url : hostUrl,
			type : 'POST',
			dataType : 'json',
			data : {
				mailAddress : inputEmail
			},
			async : true

		}).done(function(data) {
			console.log(data);
			console.dir(JSON.stringify(data));
			$("#duplicateMessage").html(data.duplicateMessage);

		}).fail(function(XMLHttpRequest, textStatus, errorThrown) {
			alert("エラーが発生しました。");
			console.log("XMLHttpRequest : " + XMLHttpRequest.status);
			console.log("textStatus : " + textStatus);
			console.log("errorThrown : " + errorThrown.message);
		});
	});
});