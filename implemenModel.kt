
// memanggil intent putExtra
// dimasukan dalam variable (movieModel)

	if(intent.hasExtra(MainActivity.EXTRA_MOVIE_DETAILS)) {
		movieModel = intent.getParcelableExtra(MainActivity.EXTRA_MOVIE_DETAILS)!!
	}
            
// Contoh 

    binding.tvJudulDetail.text = movieModel!!.judul
    binding.tvGenreDetail.text = movieModel!!.genre
    binding.tvDescDetail.text = movieModel!!.desc
    binding.tvRatingDetail.text = movieModel!!.rating.toString()
