package com.mlhysrszn.newsapp

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.fragment.app.FragmentManager

const val NEWS = "news"

@BindingAdapter("android:src")
fun ImageView.setImageViewResource(imgRes: Int) {
    setImageResource(imgRes)
}

object Utils {

    private val businessNews1 = News(
        R.drawable.business1,
        "Grubhub, DoorDash, Uber Eats sue New York City over fee caps",
        "DoorDash Inc., DASH 3.39% Grubhub Inc. and Uber Technologies Inc.’s UBER 0.70% Eats division are suing New York City over its law permanently capping the amount of commissions the apps can charge restaurants to use their services, the latest move in a growing clash between the platforms and local regulators.\n" +
                "\n" +
                "The three largest food-delivery companies filed the suit in federal court in New York late Thursday, contending that the fee cap is harmful and constitutes government overreach. The limit on fees has cost the companies hundreds of millions of dollars combined through July, they said in the suit.\n" +
                "\n" +
                "A permanent cap will likely require them to rewrite contracts with restaurants, reduce marketing in the city and raise fees for consumers, the companies said in the complaint.\n" +
                "\n" +
                "The companies are seeking an injunction that would prevent New York from enforcing the fee-cap ordinance adopted last month, unspecified monetary damages and a jury trial.\n" +
                "\n" +
                "New York City officials didn’t immediately respond to a request for comment.\n" +
                "\n" +
                "The companies are suing New York amid heightened scrutiny from local regulators across the U.S. after the Covid-19 pandemic fueled a broad consumer shift to the platforms. Many restaurants adopted app delivery to stay afloat last year, and some cities instituted guidelines around fees to help them survive.\n" +
                "\n" +
                "The food-delivery companies say they are seeking to prove the illegitimacy of the caps more broadly, alleging that they are unconstitutional and interfere with negotiated contracts. They also question capping marketing services charged by the apps, when the city doesn’t do so for other online platforms that provide advertising to companies."
    )
    private val businessNews2 = News(
        R.drawable.business2,
        "United Airlines to put workers excused from COVID-19 shot for religious reasons on unpaid leave",
        "United Airlines is giving five more weeks to employees who sought, but were denied, a company exemption from getting vaccinated against COVID-19 on religious or medical grounds. After that, they could be fired or put on unpaid leave.\n" +
                "\n" +
                "\n" +
                "The airline's 67,000 U.S.-based workers face a September 27 deadline to get their shots. United says more than half its employees who weren't vaccinated last month have done so since the company announced that vaccine requirements.\n" +
                "\n" +
                "Requests for medical exemptions at United are judged by medical staffers including nurses, while requests for waivers based on religious beliefs are handled by personnel-office employees, according to the carrier. \n" +
                "\n" +
                "Kirk Limacher, United's vice president of human resources, made the statement about vaccinations Wednesday in memos to employees that spell out how United will handle requests for exemptions.\n" +
                "\n" +
                "Under labor law, employers have the right to set their terms and conditions of employment — if a worker doesn't comply, a company can give them the ax. This also applies for COVID-19 vaccinations, according to the Equal Employment Opportunity Commission.\n" +
                "\n" +
                "Since the Food and Drug Administration in August gave full approval to the Pfizer-BioNTech vaccine, a growing number of U.S. businesses have started requiring employees to get inoculated.\n" +
                "\n" +
                "United has taken the strongest pro-vaccination stance among U.S. airlines. Delta Air Lines says it will levy a \$200 monthly surcharge on unvaccinated employees who are covered by the company's health plan. Others including American Airlines say they will cut off paid leave for unvaccinated workers who contract COVID-19."
    )
    private val businessNews3 = News(
        R.drawable.business3,
        "An Anti-Vaccine Book Tops Amazon's COVID Search Results. Lawmakers Call Foul",
        "Amazon is under pressure from Democrats in Congress over how its algorithms promote hoax COVID-19 cures, including the livestock dewormer ivermectin, as well as anti-vaccination claims and other medical misinformation.\n" +
                "\n" +
                "Rep. Adam Schiff of California and Sen. Elizabeth Warren of Massachusetts sent letters this week to CEO Andy Jassy pressing for information on Amazon's misinformation policies and what the company is doing to stop its systems from recommending books and other products linked to falsehoods about the pandemic and vaccines. \n" +
                "\n" +
                "\"Amazon is directly profiting from the sensationalism of anti-vaccine misinformation, while these conspiracy theories continue to directly contribute to COVID-19 deaths,\" Schiff wrote. \n" +
                "\n" +
                "Warren accused the e-commerce giant of being \"either unwilling or unable to modify its business practices to prevent the spread of falsehoods or the sale of inappropriate products.\""
    )
    private val business1 = BusinessNewsFragment.newInstance(businessNews1)
    private val business2 = BusinessNewsFragment.newInstance(businessNews2)
    private val business3 = BusinessNewsFragment.newInstance(businessNews3)

    private val scienceNews1 = News(
        R.drawable.science1,
        "Scientists discover giant \"swimming head\" creature that lived 500 million years ago",
        "Scientists have discovered a gigantic prehistoric relative of the horseshoe crab in the 500-million-year-old Burgess Shale in Canada, according to a study published in Royal Society Open Science on Wednesday. The creature is believed to have been one of the largest of its time, surpassing other previously discovered prehistoric crabs. \n" +
                "\n" +
                "\n" +
                "Paleontologists at the Royal Ontario Museum named the new species Titanokorys gainesi and dated it to the Cambrian period — a part of an era between 541 and 485.4 million years ago that produced the most intense burst of evolution ever seen. While most ocean-dwelling organisms in the period were no larger than a pinky finger, the Titanokorys was over half a meter in length.\n" +
                "\n" +
                "\"The sheer size of this animal is absolutely mind-boggling, this is one of the biggest animals from the Cambrian period ever found,\" Jean-Bernard Caron, the museum's Richard M. Ivey curator of invertebrate paleontology and associate professor in ecology and evolutionary biology and Earth sciences at the University of Toronto, said in a press release. \n" +
                "\n" +
                "Both the Titanokorys and the Anomalocaris were radiodonts, which were primitive arthropods with \"multifaceted eyes, a pineapple slice-shaped, tooth-lined mouth, a pair of spiny claws below its head to capture prey and a body with a series of flaps for swimming,\" according to the press release. \n" +
                "\n" +
                "\"These enigmatic animals certainly had a big impact on Cambrian seafloor ecosystems. Their limbs at the front looked like multiple stacked rakes and would have been very efficient at bringing anything they captured in their tiny spines towards the mouth,\" Caron added.\n" +
                "\n" +
                "Some species of radiodonts also had large head carapace — or defensive shells — and Titanokorys has one of the largest ever found. Unfortunately, scientists have a poor understanding of why some radiodonts have \"such a bewildering array\" of carapace sizes and shapes, but Titanokorys's broad, flat head was probably designed to help it feed on the bottom of the ocean."
    )
    private val scienceNews2 = News(
        R.drawable.science2,
        "Smoke And Burnt Plastic Triggered An Alarm On The International Space Station Earlier",
        "MOSCOW — Smoke alarms went off at the Russian segment of the International Space Station in the early hours of Thursday, and the crew reported noticing smoke and the smell of burnt plastic.\n" +
                "\n" +
                "Russia's space agency Roscosmos said the incident took place in the Russian-built Zvezda module and occurred as the station's batteries were being recharged.\n" +
                "\n" +
                "According to Roscosmos, the crew activated air filters and returned to their \"night rest\" once the air quality was back to normal. The crew will proceed with a space walk Thursday as planned, the agency noted.\n" +
                "\n" +
                "The space station is currently operated by NASA astronauts Mark Vande Hei, Shane Kimbrough and Megan McArthur; Oleg Novitsky and Pyotr Dubrov of Russia's Roscosmos; Japan Aerospace Exploration Agency astronaut Akihiko Hoshide, and European Space Agency astronaut Thomas Pesquet.\n" +
                "\n" +
                "Novitsky and Dubrov are scheduled to carry out a six-hour-long space walk on Thursday to continue integrating the Russian-built Nauka science lab that docked with the space station in July. Shortly after docking, the lab briefly knocked the orbital outpost out of position by accidentally firing its engines — an incident Russian space officials blamed on a software failure."
    )
    private val scienceNews3 = News(
        R.drawable.science3,
        "The private Inspiration4 astronauts set to ride a SpaceX rocket arrive in Florida for Sept. 14 launch",
        "The four-person crew of SpaceX's all-civilian Inspiration4 mission has arrived in Florida to prep for their historic liftoff next week.\n" +
                "\n" +
                "\"We have arrived at @NASAKennedy . . . it was a great morning of flying with my @inspiration4x crew. Right side is in! Standard. Expect more flights around KSC as we get closer to the big launch,\" Inspiration4 commander Jared Isaacman said via Twitter today (Sept. 9).\n" +
                "\n" +
                "Inspiration4 is a private mission to Earth orbit purchased by Isaacman, the billionaire founder of Shift4 Payments. He'll be joined on the flight by Hayley Arceneaux, Sian Proctor and Chris Sembroski. \n" +
                "\n" +
                "The quartet will ride to orbit on a SpaceX Crew Dragon capsule, which is scheduled to launch atop a Falcon 9 rocket from Kennedy Space Center's Pad 39A on Tuesday (Sept. 14) at 8 p.m. EDT (midnight on Sept. 15 GMT). \n" +
                "\n" +
                "The Crew Dragon in question is a vehicle named \"Resilience,\" which also flew on SpaceX's Crew-1 mission to the International Space Station for NASA. But there will be no meetup with the orbiting lab on Inspiration4; Resilience will circle Earth solo for three days, then come back for a parachute-aided splashdown in the Atlantic Ocean.\n" +
                "\n" +
                "The Inspiration4 crew was announced in March and soon began a six-month training regimen. That work included \"centrifuge training, Dragon simulations, observations of other SpaceX launch operations, Zero-G plane training, altitude training and additional classroom, simulation and medical testing,\" Inspiration4 representatives wrote in a statement last week. \"This focused preparation was essential in team development and being ready to execute their role as the first commercial crew to orbit the Earth.\""
    )
    private val science1 = ScienceNewsFragment.newInstance(scienceNews1)
    private val science2 = ScienceNewsFragment.newInstance(scienceNews2)
    private val science3 = ScienceNewsFragment.newInstance(scienceNews3)

    private val techNews1 = News(
        R.drawable.technology1,
        "Daily Crunch: Ray-Ban Stories smart glasses are latest step in Facebook’s AR ambitions",
        "Hi friends!\n" +
                "\n" +
                "Greg here again for this edition of the Daily Crunch on Thursday, September 9, 2021. Alex Wilhelm is still out on vacation for a few more days … even though he’s still tweeting a lot, which leads me to think he’s either bad at vacation or dislikes Twitter less than I do. Whatever the case, I’ll keep that daily recap goodness flowing to give you a glimpse into the biggest stories to cross our front page.\n" +
                "\n" +
                "The TechCrunch Top 3\n" +
                "Facebook’s smart Ray-Bans: Five years after Snap shipped its Spectacle sunglasses, Facebook is taking a swing at the concept. But you won’t find the Facebook logo anywhere on these things (presumably because nobody on the planet wants the Facebook logo on their face). Built in partnership with Ray-Ban’s parent company, they look just like a classic pair of Wayfarers with an added bit of heft … and cameras. A white LED lights up when you’re shooting photos or videos, and near-ear speakers pipe in your tunes and phone calls. You can’t get them wet, which is great because no one wears sunglasses around places with water, like pools or beaches. Lucas Matney reviewed them here.\n" +
                "Roomba gets smarter: New Roomba incoming! The big new feature? It’ll try to detect and avoid poop your pets might have left in its path. Past models would just blast right through that mess and drag it around, leaving owners quite the horror show to come home to.\n" +
                "Notion acquires Automate.io: Notion is buying Automate.io, a startup out of India that lets you easily hook into services like Mailchimp or Gmail or Salesforce (or Notion!) and create complex automated workflows. “It’s a sizable acquisition,” Notion’s COO said without disclosing exactly how much it spent.\n" +
                "Startups/VC\n" +
                "Skydweller Aero raises \$8M for solar-powered planes: “Airplanes and drones today, regardless of size or fuel type, all face the same limitation: eventually they have to land.” writes Aria Alamalhodaei. “Skydweller Aero, the U.S.-Spanish aerospace startup, wants to break free from that constraint … “\n" +
                "The \$510M Series E: Varo Bank just won’t stop raising money. In June 2020, it raised \$241 million, tacking on another \$63 million in February 2021 because why not. Now it’s raised a staggering \$510 million in a Series E round that values the company at \$2.5 billion. “We didn’t set out to raise this much money. It was coming in fast and furious and we were at like \$510 [million] and I finally said, ‘OK, enough,’” says Varo CEO Colin Walsh in a statement we can all totally relate to. Right? Anyone?\n" +
                "Affinity raises \$80M to use machine learning to close deals: Who in your organization is best suited to close that deal? Can machine learning algorithms chew through your company’s data (past email interactions, calendar availability, etc.) and recommend the right person? That’s part of what Affinity is working on, and they’ve raised another \$80 million to keep the ball moving and the company growing. Affinity currently has 125 employees, with plans to balloon to over 200 in the next year.\n" +
                "Anatomy of a SPAC: Inside Better.com’s ambitious plans\n" +
                "Online mortgage company Better.com isn’t waiting to complete its SPAC merger before making big moves: Today, Ryan Lawler reported that it purchased Property Partners, a U.K.-based startup that offers fractional property ownership.\n" +
                "\n" +
                "It’s the second company Better bought in recent months: In July, it snapped up digital mortgage brokerage Trussle.\n" +
                "\n" +
                "“We aren’t so easily categorized,” said Better CEO Vishal Garg, who told Ryan that the company plans to soon expand into traditional financial services like auto loans and insurance.\n" +
                "\n" +
                "Said CFO Kevin Ryan, “A lot of people have their niches in the way they’re attacking this, but we feel like we’re on a path to being full stack where everything’s embedded in the same flow.”\n" +
                "\n" +
                "Big Tech Inc.\n" +
                "Twitter communities: Twitter keeps trying new things to make Twitter more approachable for people who don’t already have 10,000 followers. The latest experiment: Communities, or moderated social hubs, in which you can tweet with others around a shared interest. Twitter is limiting the categories, for now, to topics like dogs, weather, sneakers, skincare and astrology, and presumably hoping to stay way, way, way far away from politics for as long as possible.\n" +
                "Microsoft is buying Clipchamp: Ever wished Microsoft’s 365 tool suite included a video editor? Seems it’s on the way. Microsoft announced that it’s buying up Clipchamp, a web-based tool for creating/editing videos. As for when it might be integrated into 365? TBD.\n" +
                "Quicken gets sold again: Well that was quick(en). Just a few years after being acquired by a private equity firm, Quicken is being sold off to a different private equity firm. Quicken CEO Eric Dunn shared his thoughts on the deal (plus some insights on the company’s growth as of late) with TC’s Mary Ann Azevedo.\n" +
                "\n" +
                "TechCrunch Experts: Growth Marketing\n" +
                "\n" +
                "We’re reaching out to startup founders to tell us who they turn to when they want the most up-to-date growth marketing practices. Fill out the survey here.\n" +
                "\n" +
                "Read one of the testimonials we’ve received below!\n" +
                "\n" +
                "Marketer: Kevin Miller, GR0\n" +
                "\n" +
                "Recommended by: Leeann Schudel, The Word Counter\n" +
                "\n" +
                "Testimonial: “Super detailed analysis of the space and what keywords to target that would move the needle the most. There is a full dedicated SEO team that communicates weekly at the minimum and provides in-depth analysis. They are very transparent with their strategies and explain all moves they are making on their end and how it will benefit our company. Super easy and flexible to work with, aren’t stingy on deliverables and are always there as a consultant.”"
    )
    private val techNews2 = News(
        R.drawable.technology2,
        "Apple Music is adding more DJ mixes with new features powered by Shazam",
        "Last year Apple showed how it could embed Shazam’s music identification features even more deeply within iOS 14, and now it’s taking things another step forward within Apple Music. Apple Music initially introduced DJ mixes and mash-ups in 2016 through a partnership with Dubset Media Holdings to identify and pay for licensed music within mixes.\n" +
                "\n" +
                "Now Apple says that by building upon the Shazam tech acquired in 2018 and partnering with various labels, Apple Music has the tools to identify and compensate individual creators, event promoters, labels, etc. It also allows subscribers to see the names of individual tracks, skip songs within the mix, listen with lossless audio on “most mixes,” and save them to their library for viewing offline.\n" +
                "\n" +
                "So yes, the same fingerprint ID tech that tells you the name of a song playing in the mall can apparently figure out which festival it’s from, which DJ’s mix it is, and pick out different sounds as they blend together. This is apparently detailed enough, relying on matching across Apple Music’s database of 75 million songs or so, to enable recurring revenue streams for the clubs that host sets and the DJs that make them.\n" +
                "\n" +
                "There’s a dedicated genre page for DJ mixes within the Apple Music app, and the company says engagement has tripled in the last twelve months, with over 300 million streams of DJ mixes so far.\n" +
                "\n" +
                "Apple has already been on a tear adding mixes over the last year or so, including some from Charlotte de Witte, Tiësto, Carl Cox, and others. Studio K7! founder Horst Weidenmueller said in a statement that “Through the partnership with Apple we finally have a place to celebrate DJ-Kicks with additional 14 editions which haven‘t been in the market for over 15 years.”\n" +
                "\n" +
                "Apple Music says it’s commissioning more mixes (following series released earlier this year to mark Black Music Month and Pride) and working closely with DJs to get additional content on the service. This is a new path for getting DJ mixes onto Apple Music alongside older ones like Dubset’s platform. If you already enjoy existing mixes on Apple Music, we’re told they aren’t going anywhere, even if they don’t have all the new features included. Still, it isn’t yet accessible for bedroom DJs or lesser-known names posting their mixtapes to SoundCloud, so there’s some room between this and the wild days of Muxtape."
    )
    private val techNews3 =
        News(
            R.drawable.technology3,
            "Gran Turismo 7, Spider-Man 2, KOTOR remake lead PlayStation 5 showcase",
            "Sony broke a months-long game of silence today with a wide-ranging PS5 showcase, announcing two new Marvel games from Insomniac, a remake of Star Wars: Knights of the Old Republic, and a March release date for Gran Turismo 7, among other news. This is the first significant update from the publisher since it opted to skip multiple major industry events throughout 2021. The industry behemoth is now offering first glimpses of several games in production from PlayStation Studios and third-party developers.\n" +
                    "\n" +
                    "Leading the charge was news that a remake of BioWare's classic 2003 RPG Knights of the Old Republic—which many players consider the best Star Wars game ever made—is in development as a PS5 and PC exclusive, at least at launch. Though only the briefest clip of what looked like a Sith knight was shown, we already know this is a joint project between Lucasfilm, Sony, and Aspyr Media, a studio known for porting classic Star Wars games to modern hardware. Without a release date yet, we wonder whether BioWare's Old Republic MMO will still be in operation by the time this remake launches.\n" +
                    "\n" +
                    "PlayStation Studios galore\n" +
                    "Sony also had some first-party news to share with actual PS5-only releases. Insomniac is expanding its vision of the Marvelverse in Marvel's Spider-Man 2, due out 2023, and, unexpectedly, a new game starring Wolverine.\n" +
                    "\n" +
                    "Spider-Man 2's in-game trailer had Peter Parker and Miles Morales teaming up or possibly fighting (or both) opposite fan-favorite Venom. The game is being led by creative director Bryan Intihar and director Ryan Smith from the staff of Marvel's Spider-Man.\n" +
                    "\n" +
                    "Marvel's Wolverine is still early enough in production to skip showing gameplay. Instead, we only got a CG tease of the mutant unleashing his adamantium claws in a rundown bar. No release date here, but the creative team behind Spider-Man: Miles Morales aims to bring the same faithful-to-the-spirit-of-the-comics touch to this one.\n" +
                    "\n" +
                    "As a welcome change given the franchise's usual \"it'll be done when it's done\" approach, Gran Turismo 7 announced a March 4 launch on PS4 and PS5. The news was accompanied by an operatic montage trailer that was as polished as you'd expect from Kazunori Yamauchi's detail-precise team at Polyphony Digital, highlighting the game's arcade circuits, a complicated-looking photo mode, a livery editor, reams and reams of meteorological data used to create photo-real weather and lighting, and, finally, the return of campaign mode. Though a new numbered GT is always something to look forward to, bringing back a real campaign is a huge victory for fans after its absence in Gran Turismo Sport."
        )
    private val tech1 = TechnologyNewsFragment.newInstance(techNews1)
    private val tech2 = TechnologyNewsFragment.newInstance(techNews2)
    private val tech3 = TechnologyNewsFragment.newInstance(techNews3)

    fun removeFragments(fm: FragmentManager) {
        fm.beginTransaction().remove(business1).commit()
        fm.beginTransaction().remove(business2).commit()
        fm.beginTransaction().remove(business3).commit()
        fm.beginTransaction().remove(science1).commit()
        fm.beginTransaction().remove(science2).commit()
        fm.beginTransaction().remove(science3).commit()
        fm.beginTransaction().remove(tech1).commit()
        fm.beginTransaction().remove(tech2).commit()
        fm.beginTransaction().remove(tech3).commit()
    }

    fun addFragments(fm: FragmentManager) {
        fm.beginTransaction().add(R.id.frag1, business1).commit()
        fm.beginTransaction().add(R.id.frag2, business2).commit()
        fm.beginTransaction().add(R.id.frag3, business3).commit()
        fm.beginTransaction().add(R.id.frag4, science1).commit()
        fm.beginTransaction().add(R.id.frag5, science2).commit()
        fm.beginTransaction().add(R.id.frag6, science3).commit()
        fm.beginTransaction().add(R.id.frag7, tech1).commit()
        fm.beginTransaction().add(R.id.frag8, tech2).commit()
        fm.beginTransaction().add(R.id.frag9, tech3).commit()
    }
}