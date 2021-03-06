// Connect Adapter

binding.idRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
val data = MovieAdapter(movieList!!)
binding.rvMovie.adapter = data

// Intent to Detail Page

data.setOnItemClickCallback(object : MovieAdapter.OnItemClickCallback {
    override fun onItemClicked(data: Hero) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(EXTRA_MOVIE_DETAILS, data)
        startActivity(intent)
    }
})
