package comreesringrose.httpsgithub.gordonramsaysoundboard;

import android.app.Activity;
import android.app.Application;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
// ...


import android.widget.TextView;

import java.io.IOException;

import layout.subpage2;

import static android.media.MediaPlayer.create;

public class MainActivity extends AppCompatActivity {


   private MediaPlayer mp;


    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        final MediaPlayer player = new MediaPlayer();

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);






    }


    int selectedSoundId;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState)
        {
            if(getArguments().getInt(ARG_SECTION_NUMBER)==0)
            {
                View rootView = inflater.inflate(R.layout.fragment_subpage1, container, false);
                return rootView;

            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==1)
            {
                View rootView = inflater.inflate(R.layout.fragment_subpage2, container, false);
                return rootView;

            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==2)
            {
                View rootView = inflater.inflate(R.layout.fragment_subpage3, container, false);
                return rootView;

            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==3)
            {
                View rootView = inflater.inflate(R.layout.fragment_subpage4, container, false);
                return rootView;
            }
            else
            {
                View rootView = inflater.inflate(R.layout.fragment_subpage5, container, false);
                return rootView;
            }


        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position );
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0:
                    return "Gordon Ramsay";
                case 1:
                    return "Insults 1";
                case 2:
                    return "Insults 2";
                case 3:
                    return "Statements 1";
                case 4:
                    return "Statements 2";

            }
            return null;
        }
    }




        public void Insults1(View v) {



            int id = v.getId();

            if (mp != null) {
                mp.stop();
                mp.release();

            }


            switch (id) {


                case R.id.utterjoke:
                    mp = MediaPlayer.create(this, R.raw.utterjoke);
                    mp.start();
                    break;
                case R.id.desertstorm:
                    mp = MediaPlayer.create(this, R.raw.desertstorm);
                    mp.start();
                    break;
                case R.id.dirtypig:
                    mp = MediaPlayer.create(this, R.raw.dirtypig);
                    mp.start();
                    break;
                case R.id.donkey:
                    mp = MediaPlayer.create(this, R.raw.donkey);
                    mp.start();
                    break;
                case R.id.dontfuckingdare:
                    mp = MediaPlayer.create(this, R.raw.dontfuckingdare);
                    mp.start();
                    break;
                case R.id.dontwhistle:
                    mp = MediaPlayer.create(this, R.raw.dontwhistle);
                    mp.start();
                    break;
                case R.id.ducksburnt:
                    mp = MediaPlayer.create(this, R.raw.ducksburnt);
                    mp.start();
                    break;
                case R.id.explain:
                    mp = MediaPlayer.create(this, R.raw.explain);
                    mp.start();
                    break;
                case R.id.flipflop:
                    mp = MediaPlayer.create(this, R.raw.flipflop);
                    mp.start();
                    break;
                case R.id.french:
                    mp = MediaPlayer.create(this, R.raw.french);
                    mp.start();
                    break;
                case R.id.fuckingbimbo:
                    mp = MediaPlayer.create(this, R.raw.fuckingbimbo);
                    mp.start();
                    break;
                case R.id.fuckingdonkey:
                    mp = MediaPlayer.create(this, R.raw.fuckingdonkey);
                    mp.start();
                    break;
                case R.id.getoutthere:
                    mp = MediaPlayer.create(this, R.raw.getoutthere);
                    mp.start();
                    break;
                case R.id.gremlin:
                    mp = MediaPlayer.create(this, R.raw.gremlin);
                    mp.start();
                    break;
                case R.id.idiotsandwich:
                    mp = MediaPlayer.create(this, R.raw.idiotsandwich);
                    mp.start();
                    break;
                case R.id.ifiwasyou:
                    mp = MediaPlayer.create(this, R.raw.ifiwasyou);
                    mp.start();
                    break;
                case R.id.iknowmyname:
                    mp = MediaPlayer.create(this, R.raw.iknowmyname);
                    mp.start();
                    break;
                case R.id.itsstillwalking:
                    mp = MediaPlayer.create(this, R.raw.itsstillwalking);
                    mp.start();
                    break;
                case R.id.lazycow:
                    mp = MediaPlayer.create(this, R.raw.lazycow);
                    mp.start();
                    break;
                case R.id.leaveit:
                    mp = MediaPlayer.create(this, R.raw.leaveit);
                    mp.start();
                    break;
                case R.id.listen:
                    mp = MediaPlayer.create(this, R.raw.listen);
                    mp.start();
                    break;
                case R.id.makeup:
                    mp = MediaPlayer.create(this, R.raw.makeup);
                    mp.start();
                    break;







            }


        }



    public void Insults2(View v) {


        int id = v.getId();

        if (mp != null) {
            mp.stop();
            mp.release();

        }
        switch (id) {

            case R.id.missy:

                mp = MediaPlayer.create(this, R.raw.missy);
                mp.start();
                break;
            case R.id.muppets:

                mp = MediaPlayer.create(this, R.raw.muppets);
                mp.start();
                break;
            case R.id.omg:
                mp = MediaPlayer.create(this, R.raw.omg);
                mp.start();
                break;
            case R.id.pissoff:
                mp = MediaPlayer.create(this, R.raw.pissoff);
                mp.start();
                break;
            case R.id.rabbitfood:
                mp = MediaPlayer.create(this, R.raw.rabbitfood);
                mp.start();
                break;
            case R.id.rawfuckingbass:
                mp = MediaPlayer.create(this, R.raw.rawfuckingbass);
                mp.start();
                break;
            case R.id.repeatthat:
                mp = MediaPlayer.create(this, R.raw.repeatthat);
                mp.start();
                break;
            case R.id.snap:
                mp = MediaPlayer.create(this, R.raw.snap);
                mp.start();
                break;
            case R.id.straightjacket:
                mp = MediaPlayer.create(this, R.raw.straightjacket);
                mp.start();
                break;
            case R.id.stucktothepan:
                mp = MediaPlayer.create(this, R.raw.stucktothepan);
                mp.start();
                break;
            case R.id.talent:
                mp = MediaPlayer.create(this, R.raw.talent);
                mp.start();
                break;
            case R.id.tellthecustomer:
                mp = MediaPlayer.create(this, R.raw.tellthecustomer);
                mp.start();
                break;

            case R.id.therapy:
                mp = MediaPlayer.create(this, R.raw.therapy);
                mp.start();
                break;
            case R.id.thosepoor:
                mp = MediaPlayer.create(this, R.raw.thosepoor);
                mp.start();
                break;
            case R.id.tongs:
                mp = MediaPlayer.create(this, R.raw.tongs);
                mp.start();
                break;
            case R.id.utterjoke:
                mp = MediaPlayer.create(this, R.raw.utterjoke);
                mp.start();
                break;
            case R.id.wakeup:
                mp = MediaPlayer.create(this, R.raw.wakeup);
                mp.start();
                break;
            case R.id.whatthefuck:
                mp = MediaPlayer.create(this, R.raw.whatthefuck);
                mp.start();
                break;
            case R.id.youruna:
                mp = MediaPlayer.create(this, R.raw.youruna);
                mp.start();
                break;
            case R.id.yousupriseme:
                mp = MediaPlayer.create(this, R.raw.yousupriseme);
                mp.start();
                break;

            case R.id.zackywacky:
                mp = MediaPlayer.create(this, R.raw.zackywacky);
                mp.start();
                break;


        }


    }


    public void Statements1(View v)
    {



        int id = v.getId();

        if (mp != null) {
            mp.stop();
            mp.release();

        }


        switch (id) {

            case R.id.angry:

                mp = MediaPlayer.create(this, R.raw.angry);
                mp.start();
                break;
            case R.id.arrogant:

                mp = MediaPlayer.create(this, R.raw.arrogant);
                mp.start();
                break;
            case R.id.comeheredonkeys:
                mp = MediaPlayer.create(this, R.raw.comeheredonkeys);
                mp.start();
                break;
            case R.id.consistency:
                mp = MediaPlayer.create(this, R.raw.consistency);
                mp.start();
                break;
            case R.id.disaster:
                mp = MediaPlayer.create(this, R.raw.disaster);
                mp.start();
                break;
            case R.id.domeafavour:
                mp = MediaPlayer.create(this, R.raw.domeafavour);
                mp.start();
                break;
            case R.id.dontgetpissy:
                mp = MediaPlayer.create(this, R.raw.dontgetpissy);
                mp.start();
                break;
            case R.id.eightidiots:
                mp = MediaPlayer.create(this, R.raw.eightidiots);
                mp.start();
                break;
            case R.id.everytable:
                mp = MediaPlayer.create(this, R.raw.everytable);
                mp.start();
                break;
            case R.id.finedining:
                mp = MediaPlayer.create(this, R.raw.finedining);
                mp.start();
                break;
            case R.id.getinthere:
                mp = MediaPlayer.create(this, R.raw.getinthere);
                mp.start();
                break;
            case R.id.getout:
                mp = MediaPlayer.create(this, R.raw.getout);
                mp.start();
                break;
            case R.id.hurryup:
                mp = MediaPlayer.create(this, R.raw.hurryup);
                mp.start();
                break;
            case R.id.idiots:
                mp = MediaPlayer.create(this, R.raw.idiots);
                mp.start();
                break;
            case R.id.ihaveaproblem:
                mp = MediaPlayer.create(this, R.raw.ihaveaproblem);
                mp.start();
                break;
            case R.id.itsalready:
                mp = MediaPlayer.create(this, R.raw.itsalready);
                mp.start();
                break;



        }


    }



    public void Statements2(View v)
    {



        int id = v.getId();

        if (mp != null) {
            mp.stop();
            mp.release();

        }


        switch (id) {

            case R.id.itsbland:

                mp = MediaPlayer.create(this, R.raw.itsbland);
                mp.start();
                break;
            case R.id.itsdry:
                mp = MediaPlayer.create(this, R.raw.itsdry);
                mp.start();
            case R.id.jesus:

                mp = MediaPlayer.create(this, R.raw.jesus);
                mp.start();
                break;
            case R.id.lambsauce:
                mp = MediaPlayer.create(this, R.raw.lambsauce);
                mp.start();
                break;
            case R.id.lambsauceshort:
                mp = MediaPlayer.create(this, R.raw.lambsauceshort);
                mp.start();
                break;
            case R.id.languagebarrier:
                mp = MediaPlayer.create(this, R.raw.languagebarrier);
                mp.start();
                break;
            case R.id.lookatthat:
                mp = MediaPlayer.create(this, R.raw.lookatthat);
                mp.start();
                break;
            case R.id.lookatthe:
                mp = MediaPlayer.create(this, R.raw.lookatthefillee);
                mp.start();
                break;
            case R.id.lookslike:
                mp = MediaPlayer.create(this, R.raw.lookslike);
                mp.start();
                break;
            case R.id.rasoto:
                mp = MediaPlayer.create(this, R.raw.rasoto);
                mp.start();
                break;
            case R.id.raw:
                mp = MediaPlayer.create(this, R.raw.raw);
                mp.start();
                break;
            case R.id.rubber:
                mp = MediaPlayer.create(this, R.raw.rubber);
                mp.start();
                break;
            case R.id.shit:
                mp = MediaPlayer.create(this, R.raw.shit);
                mp.start();
                break;
            case R.id.thebigsuprise:
                mp = MediaPlayer.create(this, R.raw.thebigsuprise);
                mp.start();
                break;
            case R.id.threexthree:
                mp = MediaPlayer.create(this, R.raw.threexthree);
                mp.start();
                break;
            case R.id.wellington:
                mp = MediaPlayer.create(this, R.raw.wellington);
                mp.start();
                break;
            case R.id.whatinthefuck:
                mp = MediaPlayer.create(this, R.raw.whatinthefuck);
                mp.start();
                break;
            case R.id.youhappy:
                mp = MediaPlayer.create(this, R.raw.youhappy);
                mp.start();
                break;

        }


    }


}


