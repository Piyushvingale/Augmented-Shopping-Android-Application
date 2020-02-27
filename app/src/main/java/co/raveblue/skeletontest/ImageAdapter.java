package co.raveblue.skeletontest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private Integer[] mImageIds;

    public ImageAdapter(Context c, Integer[] mImageIds) {
        this.mImageIds = mImageIds;
        mContext = c;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public Object getItem(int pos) {
        return mImageIds[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView i = new ImageView(mContext);
        i.setImageResource(mImageIds[position]);
        i.setAdjustViewBounds(true);
        i.setLayoutParams(new Gallery.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        i.setBackgroundResource(mImageIds[0]);
        return i;
    }

}