package pac.instabuildings.android;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Home extends Fragment {
	
	public Home(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
 
		//Creates a fragment layout for the landing page of the application.
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
         
        return rootView;
    }
}
