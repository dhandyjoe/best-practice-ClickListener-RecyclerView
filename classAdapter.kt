class namaClass (val data: ArrayList<modelClass>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private class MyViewHolder(val binding: namaLayoutRecyclerView): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(namaLayoutRecyclerView.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = data[position]

        if (holder is MyViewHolder) {
            holder.binding.ivPoster.setImageResource(model.poster)
            holder.binding.tvJudul.text = model.judul

            holder.itemView.setOnClickListener {
                onClickListener!!.onClick(position, model)
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    // code for click listener
    private var onClickListener: OnClickListener? = null

    fun setOnClickListener (onClickListener: OnClickListener){
        this.onClickListener = onClickListener
    }

    interface OnClickListener {
        fun onClick (position: Int, model: ModelMovie)
    }
}
