/**
 * 
 */

$('#valider').on('click',function(){

	var titre=$('#articleTitre').val();
	var article=$('#articletextarea').val();
	console.debug('article:'+titre+','+article);
});