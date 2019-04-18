package com.hkm.test;

import com.hkm.mapper.SpecilMapper;
import com.hkm.po.Speciliofo;
import com.hkm.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants.S;

public class TestSpecil {

    public static void main(String[] args) {

        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        String columNameLike ="spilinfoname";
        String columNameOrder="";
        String curPage="软";
        int pageNum = 1;
        int pageSize = 5;
        int start = (pageNum - 1) * pageSize;

        SpecilMapper specilMapper = sqlSession.getMapper(SpecilMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("start", start);
        map.put("pageSize", pageSize);
        map.put("columNameLike",columNameLike);
        map.put("columNameOrder",columNameOrder);
        map.put("pageNum",pageNum);
        List<Speciliofo> specilList = specilMapper.findSpecilSplif(map);
        for (Speciliofo specil : specilList) {
            System.out.println(specil);


            MybatisUtils.closeSqlSession(sqlSession);


        }
    }
}