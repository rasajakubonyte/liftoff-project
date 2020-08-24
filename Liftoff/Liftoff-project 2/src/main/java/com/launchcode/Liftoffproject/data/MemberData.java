package com.launchcode.Liftoffproject.data;

import com.launchcode.Liftoffproject.models.Member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberData {

    //need place to put members

    private static final Map<Integer, Member> members = new HashMap<>();
    //get all members
    public static Collection<Member> getAll(){
        return members.values();
    }
    //get a single member
    public static Member getById(int id){
        return members.get(id);
    }
    //add a member
    public static void add(Member member){
        members.put(member.getId(),member);
    }
    //delete member
    public static void remove (int id){
        members.remove(id);
    }
    //edit member
}
