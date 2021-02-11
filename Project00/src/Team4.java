package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.TeamMember;


public class Team4 extends Team
{
    public Team4(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Maxwell Schuman"));
	members.add(new TeamMember("Justin Szaro"));
	members.add(new TeamMember("Elizabeth Vicente "));

        // create a new member class for each team member
        // and add it to the team members list
    }
}

