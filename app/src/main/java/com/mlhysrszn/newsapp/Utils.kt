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
    private val businessNews4 = News(
        R.drawable.business4,
        "The lessons for investors from the trial of Theranos founder Elizabeth Holmes",
        "Sometimes an investment is too good to be true.\n" +
                "\n" +
                "As Elizabeth Holmes, founder and former CEO of Theranos, goes on trial on allegations of defrauding investors and patients, her health-care start-up may be a prime example.\n" +
                "\n" +
                "Nearly a decade ago, investors, including media mogul Rupert Murdoch, former Education Secretary Betsy DeVos and the Walton family of Walmart fame, put more than \$700 million into the company.\n" +
                "\n" +
                "Prosecutors allege investors were swayed by misrepresentations of Theranos’ blood-testing technology.\n" +
                "\n" +
                "The company’s claims about its technology, as well as its business and financial performance were either exaggerated or false, according to the Securities and Exchange Commission.\n" +
                "\n" +
                "“The Theranos story is an important lesson for Silicon Valley,” Jina Choi, director of the SEC’s San Francisco Regional Office, said at the time charges were filed. \n" +
                "\n" +
                "“Innovators who seek to revolutionize and disrupt an industry must tell investors the truth about what their technology can do today, not just what they hope it might do someday.”\n" +
                "\n" +
                "“There’s going to be a lot of attention on what did Elizabeth Holmes know and when did she know it, but a better question is what should the investment community know and when should we know it?” said Len Sherman, professor of business at Columbia Business School.  \n" +
                "\n" +
                "Theranos isn’t the only bad apple out there, it’s just the most recent example of one.\n" +
                "\n" +
                "Other black eyes for the industry include uBiome, which was investigated by the FBI for fraudulent billing, and Outcome Health, a health-care advertising company that provided misleading information to drugmakers on where their ads were showing up and how they performed.\n" +
                "\n" +
                "Of course, fraud extends far beyond health care.\n" +
                "\n" +
                "Corporate malfeasance comes in waves, Sherman said, from Enron and WorldCom to Bernie Madoff and now Theranos. “We are in another era that has conditions that are conducive to promoting fraud.” \n" +
                "\n" +
                "How to spot a problem\n" +
                "“It’s important that we don’t assume that every company is like a Theranos, we just need to ask the right questions,” said Ruby Gadelrab, founder and CEO of MDisrupt, a medical diligence company for the health-tech industry, which aims to avoid making similar mistakes in the future.\n" +
                "\n" +
                "“Health care, as a whole, is complex,” Gadelrab said. “It’s probably the hardest area to invest in.”\n" +
                "\n" +
                "To help investors vet health-technology companies, Gadelrab suggests first establishing if the product is clinically and commercially viable.\n" +
                "\n" +
                "“Investors do technical and financial diligence using experts, in health care we need to do medical diligence using health-care experts.”\n" +
                "\n"
    )
    private val businessNews5 = News(
        R.drawable.business5,
        "Amazon fights high warehouse turnover with offer of free college tuition",
        "As Amazon struggles to staff its warehouses, it’s joining other large employers by offering to pay for college tuition in an attempt to attract and retain hourly employees.\n" +
                "\n" +
                "The e-commerce giant announced Thursday that it would be broadening its education benefits by offering more than 750,000 employees the opportunity to attend college or finish high school for free. Employees only have to work at the company for 90 days to be eligible, and if they leave, they do not have to reimburse Amazon for any tuition or fees paid during their time with the company.\n" +
                "\n" +
                "Notably, it’s not a reimbursement program—Amazon is paying tuition and fees up front so employees don’t have to dip into savings to enroll. The company expects to roll out the new benefits in January. In addition to bachelor’s and associate’s degrees and GEDs, the program will cover English as a second language certifications. Amazon also announced skill training and apprenticeship programs for entry-level employees working in AWS and other IT positions. So long as an employee works for Amazon, they'll be able to use the benefit, potentially earning multiple degrees or certifications if they so choose.\n" +
                "\n" +
                "Full-time employees are eligible for the fully subsidized tuition, while part-time workers logging as few as 20 hours per week will receive half the benefit. Though the company still has details to work out, it says that employees can use the benefit at “hundreds of education partners across the country.” Workers may be limited in terms of which degree programs they could apply to, and the programs may vary by region. Ardine Williams, the company’s vice president of workforce development, told The Wall Street Journal that she expects the company will subsidize degrees in technology, engineering, and health care. The expanded benefit goes well beyond what Amazon previously offered—95 percent of the cost of an associate’s degree or other certification.\n" +
                "One potential hitch could be scheduling, though Amazon says that it will provide flexible work schedules for students accommodate both school and work.\n" +
                "\n" +
                "In total, Amazon anticipates the programs will cost \$1.2 billion by 2025. Last year, the company made \$21.3 billion in profit on \$386 billion in revenue. Other companies like Walmart, Target, Chipotle, and JBS, a meat processor, offer comparable tuition subsidy programs, according to The Wall Street Journal.\n" +
                "\n" +
                "Retention strategy\n" +
                "The move comes as Amazon has encountered high turnover at its front-line operations, particularly its warehouses. Since the pandemic began, Amazon says that it has hired 400,000 new workers who are eligible for the perk. Some of that has come as a result of expanded operations, but much of it is the result of people quitting. Among hourly employees, the turnover rate is 3 percent per week or about 150 percent per year, according to a New York Times investigation. In other words, in a single year, Amazon has to hire the equivalent of one-and-a-half times its entire hourly staff.\n" +
                "\n" +
                "The education benefit may help lower that rate somewhat, Chris O’Leary, a senior economist at the WE Upjohn Institute for Employment Research, told The Wall Street Journal. “They might be able to get enough productive months or years out of somebody to make it worth the investment.”\n" +
                "The economic recovery has driven a hiring boom that has left workers in high demand. Increased wages have helped employers staff up to some extent, but that hasn’t tamped workers' desires to advance in their careers, not simply get paid a bit more. (Still, don’t discount the financial motivation—people who finish some college make around 20 percent more than those with only a high school diploma, and those who have a bachelor’s earn about 80 percent more.)\n" +
                "\n" +
                "Education benefits may help attract employees who are more willing to endure working conditions in Amazon’s warehouses. Workers are tracked as they complete tasks around the warehouse and pushed to finish them faster. That has led to heightened injury rates, according to one investigation, and instances where workers say they’ve skipped breaks to stay on top of their tasks.\n" +
                "\n" +
                "California’s legislature has taken up the issue with a bill that aims to limit the use of algorithmic monitoring and quotas that can lead to unsafe conditions. The legislation would require companies to disclose productivity quotas to government agencies and employees alike, and it would forbid employers from establishing quotas that prevent workers from taking legally mandated breaks or skipping trips to the bathroom."
    )
    private val business1 = BusinessNewsFragment.newInstance(businessNews1)
    private val business2 = BusinessNewsFragment.newInstance(businessNews2)
    private val business3 = BusinessNewsFragment.newInstance(businessNews3)
    private val business4 = BusinessNewsFragment.newInstance(businessNews4)
    private val business5 = BusinessNewsFragment.newInstance(businessNews5)

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
    private val scienceNews4 = News(
        R.drawable.science4,
        "Spectacular valleys and cliffs hidden beneath the North Sea",
        "Like a bowl of spaghetti noodles spilled across the floor of the North Sea, a vast array of hidden tunnel valleys wind and meander across what was once an ice-covered landscape. \n" +
                "\n" +
                "These valleys are remnants of ancient rivers that once drained water from melting ice sheets.\n" +
                "\n" +
                "Now, scientists have achieved the clearest view yet of these channels. They're buried hundreds of feet beneath the seafloor, and they are enormous, ranging from about 0.6 to 3.7 miles (1 to 6 kilometers) wide.\n" +
                "\n" +
                "The new imaging reveals fine-grained details within these expansive features: small, delicate ridges of sediment, larger walls of sediment that can be miles long and craters called kettle holes left behind by melting chunks of ice.\n" +
                "\n" +
                "Related: See photos of Earth's vanishing ice\n" +
                "\n" +
                "\"We didn't expect to find these kinds of footprints of the ice sheet within the channels themselves,\" said study lead author James Kirkham, a marine geophysicist at the British Antarctic Survey and the University of Cambridge. \"And that tells us, actually, that the ice was interacting with the channels a lot more than previously assumed.\"\n" +
                "\n" +
                "Footprints of glaciers\n" +
                "These channels are the footprints of glaciers left behind from between 700,000 and 100,000 years ago, when most of the North Sea, as well as the northern two-thirds of the United Kingdom and all of Ireland were often buried under huge ice sheets. (The ice advanced and retreated seven or eight times within this period, Kirkham told Live Science.)\n" +
                "\n" +
                "During periods when the climate warmed and the ice retreated, these ice sheets discharged water through hidden glacial channels beneath the ice. These channels left their imprint on the sediments below. More sediments then piled on top as the ice vanished, entombing the imprints deep beneath the seafloor.\n" +
                "\n" +
                "To see these ancient impressions, geophysicists use a technology called 3D seismic reflection. In this process, scientists shoot bursts of compressed air toward the seafloor. The resulting sound waves travel through the rock and sediment layers beneath the seafloor and bounce back, where they're picked up by a shipboard receiver. Because sound travels at different speeds through different types of rock and sediment, the data can be reconstructed into a picture of the subsurface.\n" +
                "\n" +
                "A map of the undersea tunnel valleys looks like a vast array of squiggles, like a scattering of spilled noodles. But zoomed in, the channels are visible in stunning detail. They meander and wind like rivers (which they once were), bounded by shear cliffs and rugged slopes. Some plummet 310 miles (500 km) deep into the sediment and are dozens of miles long."
    )
    private val scienceNews5 = News(
        R.drawable.science5,
        "New programmable gene editing proteins found outside of CRISPR systems",
        "Within the last decade, scientists have adapted CRISPR systems from microbes into gene editing technology, a precise and programmable system for modifying DNA. Now, scientists at MIT's McGovern Institute and the Broad Institute of MIT and Harvard have discovered a new class of programmable DNA modifying systems called OMEGAs (Obligate Mobile Element Guided Activity), which may naturally be involved in shuffling small bits of DNA throughout bacterial genomes.\n" +
                "\n" +
                "\n" +
                "These ancient DNA-cutting enzymes are guided to their targets by small pieces of RNA. While they originated in bacteria, they have now been engineered to work in human cells, suggesting they could be useful in the development of gene editing therapies, particularly as they are small (~30% the size of Cas9), making them easier to deliver to cells than bulkier enzymes. The discovery, reported in the journal Science, provides evidence that natural RNA-guided enzymes are among the most abundant proteins on earth, pointing toward a vast new area of biology that is poised to drive the next revolution in genome editing technology.\n" +
                "\n" +
                "The research was led by McGovern investigator Feng Zhang, who is James and Patricia Poitras Professor of Neuroscience at MIT, a Howard Hughes Medical Institute investigator, and a core institute member of the Broad Institute. Zhang's team has been exploring natural diversity in search of new molecular systems that can be rationally programmed.\n" +
                "\n" +
                "\"We are super excited about the discovery of these widespread programmable enzymes, which have been hiding under our noses all along,\" says Zhang. \"These results suggest the tantalizing possibility that there are many more programmable systems that await discovery and development as useful technologies.\"\n" +
                "\n" +
                "Programmable enzymes, particularly those that use an RNA guide, can be rapidly adapted for different uses. For example, CRISPR enzymes naturally use an RNA guide to target viral invaders, but biologists can direct Cas9 to any target by generating their own RNA guide. \"It's so easy to just change a guide sequence and set a new target,\" says graduate student and co-first author of the paper, Soumya Kannan. \"So one of the broad questions that we're interested in is trying to see if other natural systems use that same kind of mechanism.\"\n" +
                "\n" +
                "The first hints that OMEGA proteins might be directed by RNA came from the genes for proteins called IscBs. The IscBs are not involved in CRISPR immunity and were not known to associate with RNA, but they looked like small, DNA-cutting enzymes. The team discovered that each IscB had a small RNA encoded nearby and it directed IscB enzymes to cut specific DNA sequences. They named these RNAs \"ωRNAs.\"\n" +
                "\n" +
                "The team's experiments showed that two other classes of small proteins known as IsrBs and TnpBs, one of the most abundant genes in bacteria, also use ωRNAs that act as guides to direct the cleavage of DNA.\n" +
                "\n" +
                "IscB, IsrB, and TnpB are found in mobile genetic elements called transposons. Graduate student Han Altae-Tran, co-first author on the paper, explains that each time these transposons move, they create a new guide RNA, allowing the enzyme they encode to cut somewhere else.\n" +
                "\n" +
                "It's not clear how bacteria benefit from this genomic shuffling—or whether they do at all. Transposons are often thought of as selfish bits of DNA, concerned only with their own mobility and preservation, Kannan says. But if hosts can \"co-opt\" these systems and repurpose them, hosts may gain new abilities, as with CRISPR systems which confer adaptive immunity.\n" +
                "\n" +
                "IscBs and TnpBs appear to be predecessors of Cas9 and Cas12 CRISPR systems. The team suspects they, along with IsrB, likely gave rise to other RNA-guided enzymes, too—and they are eager to find them. They are curious about the range of functions that might be carried out in nature by RNA-guided enzymes, Kannan says, and suspect evolution likely already took advantage of OMEGA enzymes like IscBs and TnpBs to solve problems that biologists are keen to tackle.\n" +
                "\n" +
                "\"A lot of the things that we have been thinking about may already exist naturally in some capacity,\" says Altae-Tran. \"Natural versions of these types of systems might be a good starting point to adapt for that particular task.\"\n" +
                "\n" +
                "The team is also interested in tracing the evolution of RNA-guided systems further into the past. \"Finding all these new systems sheds light on how RNA-guided systems have evolved, but we don't know where RNA-guided activity itself comes from,\" Altae-Tran says. Understanding those origins, he says, could pave the way to developing even more classes of programmable tools."
    )
    private val science1 = ScienceNewsFragment.newInstance(scienceNews1)
    private val science2 = ScienceNewsFragment.newInstance(scienceNews2)
    private val science3 = ScienceNewsFragment.newInstance(scienceNews3)
    private val science4 = ScienceNewsFragment.newInstance(scienceNews4)
    private val science5 = ScienceNewsFragment.newInstance(scienceNews5)

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
    private val techNews4 = News(
        R.drawable.technology4,
        "Epic Games vs. Apple Judgment Allows App Store Developers to Link to Alternative Payment Methods",
        "A decision was reached today in the high-profile Epic Games v. Apple trial, with U.S. District Judge Yvonne Gonzalez Rogers ruling that Apple's anti-steering conduct is anti-competitive, and ruling in favor of Apple on all other counts.\n" +
                "\n" +
                "In a 185-page ruling, Judge Rogers said \"the Court cannot ultimately conclude that Apple is a monopolist under either federal or state antitrust laws,\" but she said the trial \"did show that Apple is engaging in anticompetitive conduct under California's competition laws.\" Rogers concluded that \"Apple's anti-steering provisions hide critical information from consumers and illegally stifle consumer choice\":\n" +
                "\n" +
                "Having defined the relevant market as digital mobile gaming transactions, the Court next evaluated Apple's conduct in that market. Given the trial record, the Court cannot ultimately conclude that Apple is a monopolist under either federal or state antitrust laws. While the Court finds that Apple enjoys considerable market share of over 55% and extraordinarily high profit margins, these factors alone do not show antitrust conduct. Success is not illegal. The final trial record did not include evidence of other critical factors, such as barriers to entry and conduct decreasing output or decreasing innovation in the relevant market. The Court does not find that it is impossible; only that Epic Games failed in its burden to demonstrate Apple is an illegal monopolist.\n" +
                "\n" +
                "Nonetheless, the trial did show that Apple is engaging in anticompetitive conduct under California's competition laws. The Court concludes that Apple’s anti-steering provisions hide critical information from consumers and illegally stifle consumer choice. When coupled with Apple's incipient antitrust violations, these anti-steering provisions are anticompetitive and a nationwide remedy to eliminate those provisions is warranted.\n" +
                "\n" +
                "Judge Rogers thus issued a permanent injunction that requires Apple to let U.S. developers direct customers to payment options other than Apple's in-app purchase system:\n" +
                "\n" +
                "Apple Inc. and its officers, agents, servants, employees, and any person in active concert or participation with them (\"Apple\"), are hereby permanently restrained and enjoined from prohibiting developers from (i) including in their apps and their metadata buttons, external links, or other calls to action that direct customers to purchasing mechanisms, in addition to In-App Purchasing and (ii) communicating with customers through points of contact obtained voluntarily from customers through account registration within the app.\n" +
                "\n" +
                "Apple already announced last week that, starting in early 2022, it would allow developers of \"reader\" apps like Netflix, Spotify, and the Amazon Kindle app to include an in-app link to their website for users to set up or manage an account. If this ruling is upheld, however, Apple will be required to extend this allowance to all types of apps. The ruling also ensures that developers would be able to explicitly mention alternative payment options.\n" +
                "\n" +
                "The saga began in August 2020, when Apple removed Fortnite from the App Store after Epic Games introduced a direct payment option in the app, in defiance of the App Store rules. In an orchestrated move, Epic Games promptly filed a lawsuit against Apple, accusing Apple of having a monopoly over the sale of apps and in-app purchases through the App Store. (See our timeline of events surrounding the trial for more details.)\n" +
                "\n" +
                "Judge Rogers ruled that Epic Games shall pay damages equal to 30% of the \$12,167,719 in revenue that Epic Games collected from users in the Fortnite app on iOS through the direct payment option between August 2020 and October 2020, plus 30% of any such revenue Epic Games collected from November 1, 2020 through the date of judgment, plus interest.\n" +
                "\n" +
                "Apple is likely to appeal the decision. We've reached out to the company for comment and we will update this story if we hear back.\n" +
                "\n" +
                "Update: Apple has issued the following statement, as shared by Nick Statt:\n" +
                "\n" +
                "Today the Court has affirmed what we've known all along: the App Store is not in violation of antitrust law. As the Court recognized 'success is not illegal.' Apple faces rigorous competition in every segment in which we do business, and we believe customers and developers choose us because our products and services are the best in the world. We remain committed to ensuring the App Store is a safe and trusted marketplace that supports a thriving developer community and more than 2.1 million U.S. jobs, and where rules apply equally to everyone.\n" +
                "\n" +
                "The court documents associated with the ruling are embedded below."
    )
    private val techNews5 = News(
        R.drawable.technology5,
        "The Apple Watch Series 7 May Not Be Too Delayed After All",
        "For the last few months, the Apple Watch Series 7 was expected to debut alongside the iPhone 13 lineup next Tuesday. However, recent reports about production issues cast some doubts over that timeline. Now, it looks like the smartwatch is back on track to ship later this month.\n" +
                "\n" +
                "The news comes from a new investor report from good, ole reliable Apple analyst Ming-Chi Kuo (via MacRumors). In November, Kuo said that the Series 7 was due for a significant redesign, and in recent weeks, leaked images of the Series 7 seemed to show a slightly larger screen and a flat-edge design reminiscent of the iPhone 12. Last week, Nikkei Asia and Bloomberg both wrote that the new design was causing problems with test production, delaying the watches from entering mass production as previously planned.\n" +
                "\n" +
                "Kuo’s latest report adds a little more detail. The Series 7 purportedly has a more durable display panel that uses a new contact design that required a new production process. It also needed to use new suppliers, including LG Display, Young Poong, and Jabil to help with more efficient and economical OLED production. Kuo says that issues surrounding this panel module have since been resolved by making adjustments through a series of design experiments. As a result, Kuo says he expects mass production for the Series 7 to begin in mid-September and for shipments to begin in late September.\n" +
                "\n" +
                "This makes it a lot more likely that we’ll actually hear an announcement about the Series 7 next week, though it may not be immediately available. This has been echoed by Bloomberg’s Mark Gurman, who predicted last week that the watch would be announced next week but would ship late, or in smaller quantities.\n" +
                "\n" +
                "It’s not a Kuo report if we don’t hear a little something about future Apple products as well. This time around, Kuo mentioned he’s optimistic for next year’s Apple Watch, as it will include new health features—specifically, the ability to measure temperature. This dovetails with a recent Wall Street Journal report that contends Apple is working on a number of advanced health features, including the ability to measure blood pressure and body temperature. The body temperature sensor will reportedly help give users more insight into fertility planning. There are also a ton of other functions that a body temperature sensor could be useful for. Recovery trackers like Whoop and Oura Ring use them to evaluate the quality of sleep, while other researchers have been studying whether skin temperature data from wearables could potentially help detect infectious diseases."
    )
    private val tech1 = TechnologyNewsFragment.newInstance(techNews1)
    private val tech2 = TechnologyNewsFragment.newInstance(techNews2)
    private val tech3 = TechnologyNewsFragment.newInstance(techNews3)
    private val tech4 = TechnologyNewsFragment.newInstance(techNews4)
    private val tech5 = TechnologyNewsFragment.newInstance(techNews5)

    fun removeFragments(fm: FragmentManager) {
        fm.beginTransaction().remove(business1).commit()
        fm.beginTransaction().remove(business2).commit()
        fm.beginTransaction().remove(business3).commit()
        fm.beginTransaction().remove(business4).commit()
        fm.beginTransaction().remove(business5).commit()
        fm.beginTransaction().remove(science1).commit()
        fm.beginTransaction().remove(science2).commit()
        fm.beginTransaction().remove(science3).commit()
        fm.beginTransaction().remove(science4).commit()
        fm.beginTransaction().remove(science5).commit()
        fm.beginTransaction().remove(tech1).commit()
        fm.beginTransaction().remove(tech2).commit()
        fm.beginTransaction().remove(tech3).commit()
        fm.beginTransaction().remove(tech4).commit()
        fm.beginTransaction().remove(tech5).commit()
    }

    fun addFragments(fm: FragmentManager) {
        fm.beginTransaction().add(R.id.frag1, business1).commit()
        fm.beginTransaction().add(R.id.frag2, business2).commit()
        fm.beginTransaction().add(R.id.frag3, business3).commit()
        fm.beginTransaction().add(R.id.frag4, business4).commit()
        fm.beginTransaction().add(R.id.frag5, business5).commit()
        fm.beginTransaction().add(R.id.frag6, science1).commit()
        fm.beginTransaction().add(R.id.frag7, science2).commit()
        fm.beginTransaction().add(R.id.frag8, science3).commit()
        fm.beginTransaction().add(R.id.frag9, science4).commit()
        fm.beginTransaction().add(R.id.frag10, science5).commit()
        fm.beginTransaction().add(R.id.frag11, tech1).commit()
        fm.beginTransaction().add(R.id.frag12, tech2).commit()
        fm.beginTransaction().add(R.id.frag13, tech3).commit()
        fm.beginTransaction().add(R.id.frag14, tech4).commit()
        fm.beginTransaction().add(R.id.frag15, tech5).commit()
    }
}