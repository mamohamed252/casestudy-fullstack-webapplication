$(document).ready(function () {
	loadAllDvds();
	$('#show-addDvd-form-button').click(function() {
   		$('#add-new-form').show(); 
	});

	$('#add-dvd-button').click(function() {
		$('#add-new-form').hide();
		addDvdInfo(); 
	});

	$('#add-cancel-button').click(function() {
		$('#add-new-form').hide(); 
	});
});


function loadAllDvds(){
	var dvdRows = $('#dvdRows');

	$.ajax({
		type: 'GET',
		url: 'http://localhost:8080/dvds',
		success: function(dvdArray){
			$.each(dvdArray, function(index, dvd){
				var title = dvd.title;
				var releaseYear = dvd.releaseYear;
				var director = dvd.director;
				var rating = dvd.rating;
				var notes = dvd.notes;


				var row = '<tr>';
					row += '<td>' + title + '</td>';
					row += '<td>' + releaseYear  + '</td>';
					row += '<td>' + director + '</td>';
					row += '<td>' + rating + '</td>';
					row += '<td>' + notes + '</td>';
					row += '<td><a>Edit</a></td>';
					row += '<td><a>Delete</a></td>'; 
					row += 	'</tr>';

				dvdRows.append(row);  
			});

		},
		error: function(){

		}
	});
}