class namaClass (val data: ArrayList<modelClass>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private class MyViewHolder(val binding: namaLayoutRecyclerView): RecyclerView.ViewHolder(binding.root)
    
    // code clickListener
    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(namaLayoutRecyclerView.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = data[position]

        if (holder is MyViewHolder) {
            holder.binding.ivPoster.setImageResource(model.poster)
            holder.binding.tvJudul.text = model.judul

            holder.itemView.setOnClickListener {
                onItemClickCallback.onItemClicked(data[position])
            }
        }
    }

    override fun getItemCount(): Int = data.size
    
    
    // add interface
    interface OnItemClickCallback {
        fun onItemClicked(data: Hero)
    }
}
