package temple.edu.fragmentcoloractivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsStatePagerAdapter extends FragmentStatePagerAdapter
{

    private final List<Fragment> mFragmentList = new ArrayList<>(); //collection of the fragments
    private final List<String> mFragmentTitleList = new ArrayList<>(); //collection of the fragment's title

    public SectionsStatePagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String title)
    {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
