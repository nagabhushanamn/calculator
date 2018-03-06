/**
 * 
 */

$(document).ready(function() {
	$('#arith-form').submit(function(e) {
		e.preventDefault();
		let n1 = $('#n1', this).val();
		let n2 = $('#n2', this).val();
		let action = $('#action', this).val();
		console.log(action);
		$.ajax(`arith?n1=${n1}&n2=${n2}&action=${action}&`, {
			method : 'GET',
			success : function(response) {
				$('#arith-result').text(response);
				$('#n1').val('');
				$('#action').val('#');
				$('#n2').val('');
			}
		});
	});
})