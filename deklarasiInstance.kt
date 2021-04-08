// Connect Adapter

binding.idRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
val data = MovieAdapter(movieList!!)
binding.rvMovie.adapter = data

// Intent to Detail Page

data.setOnClickListener(object : MovieAdapter.OnClickListener {
    override fun onClick(position: Int, model: ModelMovie) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(EXTRA_MOVIE_DETAILS, model)
        startActivity(intent)
     }
})

