package com.nba.nba_zone.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "nba_player_stats")
public class NbaPlayerStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "player_id")
    private Integer playerId;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "team_id")
    private Integer teamId;

    @Column(name = "team_abbreviation")
    private String teamAbbreviation;

    @Column(name = "age")
    private Float age;

    @Column(name = "gp")
    private Integer gp;

    @Column(name = "w")
    private Integer w;

    @Column(name = "l")
    private Integer l;

    @Column(name = "w_pct")
    private Float wPct;

    @Column(name = "min")
    private Float min;

    @Column(name = "fgm")
    private Float fgm;

    @Column(name = "fga")
    private Float fga;

    @Column(name = "fg_pct")
    private Float fgPct;

    @Column(name = "fg3m")
    private Float fg3m;

    @Column(name = "fg3a")
    private Float fg3a;

    @Column(name = "fg3_pct")
    private Float fg3Pct;

    @Column(name = "ftm")
    private Float ftm;

    @Column(name = "fta")
    private Float fta;

    @Column(name = "ft_pct")
    private Float ftPct;

    @Column(name = "oreb")
    private Float oreb;

    @Column(name = "dreb")
    private Float dreb;

    @Column(name = "reb")
    private Float reb;

    @Column(name = "ast")
    private Float ast;

    @Column(name = "tov")
    private Float tov;

    @Column(name = "stl")
    private Float stl;

    @Column(name = "blk")
    private Float blk;

    @Column(name = "blka")
    private Float blka;

    @Column(name = "pf")
    private Float pf;

    @Column(name = "pfd")
    private Float pfd;

    @Column(name = "pts")
    private Float pts;

    @Column(name = "plus_minus")
    private Float plusMinus;

    @Column(name = "nba_fantasy_pts")
    private Float nbaFantasyPts;

    @Column(name = "dd2")
    private Integer dd2;

    @Column(name = "td3")
    private Integer td3;

    @Column(name = "wnba_fantasy_pts")
    private Float wnbaFantasyPts;

    @Column(name = "gp_rank")
    private Integer gpRank;

    @Column(name = "w_rank")
    private Integer wRank;

    @Column(name = "l_rank")
    private Integer lRank;

    @Column(name = "w_pct_rank")
    private Integer wPctRank;

    @Column(name = "min_rank")
    private Integer minRank;

    @Column(name = "fgm_rank")
    private Integer fgmRank;

    @Column(name = "fga_rank")
    private Integer fgaRank;

    @Column(name = "fg_pct_rank")
    private Integer fgPctRank;

    @Column(name = "fg3m_rank")
    private Integer fg3mRank;

    @Column(name = "fg3a_rank")
    private Integer fg3aRank;

    @Column(name = "fg3_pct_rank")
    private Integer fg3PctRank;

    @Column(name = "ftm_rank")
    private Integer ftmRank;

    @Column(name = "fta_rank")
    private Integer ftaRank;

    @Column(name = "ft_pct_rank")
    private Integer ftPctRank;

    @Column(name = "oreb_rank")
    private Integer orebRank;

    @Column(name = "dreb_rank")
    private Integer drebRank;

    @Column(name = "reb_rank")
    private Integer rebRank;

    @Column(name = "ast_rank")
    private Integer astRank;

    @Column(name = "tov_rank")
    private Integer tovRank;

    @Column(name = "stl_rank")
    private Integer stlRank;

    @Column(name = "blk_rank")
    private Integer blkRank;

    @Column(name = "blka_rank")
    private Integer blkaRank;

    @Column(name = "pf_rank")
    private Integer pfRank;

    @Column(name = "pfd_rank")
    private Integer pfdRank;

    @Column(name = "pts_rank")
    private Integer ptsRank;

    @Column(name = "plus_minus_rank")
    private Integer plusMinusRank;

    @Column(name = "nba_fantasy_pts_rank")
    private Integer nbaFantasyPtsRank;

    @Column(name = "dd2_rank")
    private Integer dd2Rank;

    @Column(name = "td3_rank")
    private Integer td3Rank;

    @Column(name = "wnba_fantasy_pts_rank")
    private Integer wnbaFantasyPtsRank;
    // Getters and setters for each field (omitted for brevity)


    public NbaPlayerStats() {
    }

    public NbaPlayerStats(Long id, Integer playerId, String playerName, String nickname, Integer teamId, String teamAbbreviation, Float age, Integer gp, Integer w, Integer l, Float wPct, Float min, Float fgm, Float fga, Float fgPct, Float fg3m, Float fg3a, Float fg3Pct, Float ftm, Float fta, Float ftPct, Float oreb, Float dreb, Float reb, Float ast, Float tov, Float stl, Float blk, Float blka, Float pf, Float pfd, Float pts, Float plusMinus, Float nbaFantasyPts, Integer dd2, Integer td3, Float wnbaFantasyPts, Integer gpRank, Integer wRank, Integer lRank, Integer wPctRank, Integer minRank, Integer fgmRank, Integer fgaRank, Integer fgPctRank, Integer fg3mRank, Integer fg3aRank, Integer fg3PctRank, Integer ftmRank, Integer ftaRank, Integer ftPctRank, Integer orebRank, Integer drebRank, Integer rebRank, Integer astRank, Integer tovRank, Integer stlRank, Integer blkRank, Integer blkaRank, Integer pfRank, Integer pfdRank, Integer ptsRank, Integer plusMinusRank, Integer nbaFantasyPtsRank, Integer dd2Rank, Integer td3Rank, Integer wnbaFantasyPtsRank) {
        this.id = id;
        this.playerId = playerId;
        this.playerName = playerName;
        this.nickname = nickname;
        this.teamId = teamId;
        this.teamAbbreviation = teamAbbreviation;
        this.age = age;
        this.gp = gp;
        this.w = w;
        this.l = l;
        this.wPct = wPct;
        this.min = min;
        this.fgm = fgm;
        this.fga = fga;
        this.fgPct = fgPct;
        this.fg3m = fg3m;
        this.fg3a = fg3a;
        this.fg3Pct = fg3Pct;
        this.ftm = ftm;
        this.fta = fta;
        this.ftPct = ftPct;
        this.oreb = oreb;
        this.dreb = dreb;
        this.reb = reb;
        this.ast = ast;
        this.tov = tov;
        this.stl = stl;
        this.blk = blk;
        this.blka = blka;
        this.pf = pf;
        this.pfd = pfd;
        this.pts = pts;
        this.plusMinus = plusMinus;
        this.nbaFantasyPts = nbaFantasyPts;
        this.dd2 = dd2;
        this.td3 = td3;
        this.wnbaFantasyPts = wnbaFantasyPts;
        this.gpRank = gpRank;
        this.wRank = wRank;
        this.lRank = lRank;
        this.wPctRank = wPctRank;
        this.minRank = minRank;
        this.fgmRank = fgmRank;
        this.fgaRank = fgaRank;
        this.fgPctRank = fgPctRank;
        this.fg3mRank = fg3mRank;
        this.fg3aRank = fg3aRank;
        this.fg3PctRank = fg3PctRank;
        this.ftmRank = ftmRank;
        this.ftaRank = ftaRank;
        this.ftPctRank = ftPctRank;
        this.orebRank = orebRank;
        this.drebRank = drebRank;
        this.rebRank = rebRank;
        this.astRank = astRank;
        this.tovRank = tovRank;
        this.stlRank = stlRank;
        this.blkRank = blkRank;
        this.blkaRank = blkaRank;
        this.pfRank = pfRank;
        this.pfdRank = pfdRank;
        this.ptsRank = ptsRank;
        this.plusMinusRank = plusMinusRank;
        this.nbaFantasyPtsRank = nbaFantasyPtsRank;
        this.dd2Rank = dd2Rank;
        this.td3Rank = td3Rank;
        this.wnbaFantasyPtsRank = wnbaFantasyPtsRank;
    }

    public Long getId() {
        return id;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public String getTeamAbbreviation() {
        return teamAbbreviation;
    }

    public Float getAge() {
        return age;
    }

    public Integer getGp() {
        return gp;
    }

    public Integer getW() {
        return w;
    }

    public Integer getL() {
        return l;
    }

    public Float getwPct() {
        return wPct;
    }

    public Float getMin() {
        return min;
    }

    public Float getFgm() {
        return fgm;
    }

    public Float getFga() {
        return fga;
    }

    public Float getFgPct() {
        return fgPct;
    }

    public Float getFg3m() {
        return fg3m;
    }

    public Float getFg3a() {
        return fg3a;
    }

    public Float getFg3Pct() {
        return fg3Pct;
    }

    public Float getFtm() {
        return ftm;
    }

    public Float getFta() {
        return fta;
    }

    public Float getFtPct() {
        return ftPct;
    }

    public Float getOreb() {
        return oreb;
    }

    public Float getDreb() {
        return dreb;
    }

    public Float getReb() {
        return reb;
    }

    public Float getAst() {
        return ast;
    }

    public Float getTov() {
        return tov;
    }

    public Float getStl() {
        return stl;
    }

    public Float getBlk() {
        return blk;
    }

    public Float getBlka() {
        return blka;
    }

    public Float getPf() {
        return pf;
    }

    public Float getPfd() {
        return pfd;
    }

    public Float getPts() {
        return pts;
    }

    public Float getPlusMinus() {
        return plusMinus;
    }

    public Float getNbaFantasyPts() {
        return nbaFantasyPts;
    }

    public Integer getDd2() {
        return dd2;
    }

    public Integer getTd3() {
        return td3;
    }

    public Float getWnbaFantasyPts() {
        return wnbaFantasyPts;
    }

    public Integer getGpRank() {
        return gpRank;
    }

    public Integer getwRank() {
        return wRank;
    }

    public Integer getlRank() {
        return lRank;
    }

    public Integer getwPctRank() {
        return wPctRank;
    }

    public Integer getMinRank() {
        return minRank;
    }

    public Integer getFgmRank() {
        return fgmRank;
    }

    public Integer getFgaRank() {
        return fgaRank;
    }

    public Integer getFgPctRank() {
        return fgPctRank;
    }

    public Integer getFg3mRank() {
        return fg3mRank;
    }

    public Integer getFg3aRank() {
        return fg3aRank;
    }

    public Integer getFg3PctRank() {
        return fg3PctRank;
    }

    public Integer getFtmRank() {
        return ftmRank;
    }

    public Integer getFtaRank() {
        return ftaRank;
    }

    public Integer getFtPctRank() {
        return ftPctRank;
    }

    public Integer getOrebRank() {
        return orebRank;
    }

    public Integer getDrebRank() {
        return drebRank;
    }

    public Integer getRebRank() {
        return rebRank;
    }

    public Integer getAstRank() {
        return astRank;
    }

    public Integer getTovRank() {
        return tovRank;
    }

    public Integer getStlRank() {
        return stlRank;
    }

    public Integer getBlkRank() {
        return blkRank;
    }

    public Integer getBlkaRank() {
        return blkaRank;
    }

    public Integer getPfRank() {
        return pfRank;
    }

    public Integer getPfdRank() {
        return pfdRank;
    }

    public Integer getPtsRank() {
        return ptsRank;
    }

    public Integer getPlusMinusRank() {
        return plusMinusRank;
    }

    public Integer getNbaFantasyPtsRank() {
        return nbaFantasyPtsRank;
    }

    public Integer getDd2Rank() {
        return dd2Rank;
    }

    public Integer getTd3Rank() {
        return td3Rank;
    }

    public Integer getWnbaFantasyPtsRank() {
        return wnbaFantasyPtsRank;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public void setTeamAbbreviation(String teamAbbreviation) {
        this.teamAbbreviation = teamAbbreviation;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public void setGp(Integer gp) {
        this.gp = gp;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public void setL(Integer l) {
        this.l = l;
    }

    public void setwPct(Float wPct) {
        this.wPct = wPct;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public void setFgm(Float fgm) {
        this.fgm = fgm;
    }

    public void setFga(Float fga) {
        this.fga = fga;
    }

    public void setFgPct(Float fgPct) {
        this.fgPct = fgPct;
    }

    public void setFg3m(Float fg3m) {
        this.fg3m = fg3m;
    }

    public void setFg3a(Float fg3a) {
        this.fg3a = fg3a;
    }

    public void setFg3Pct(Float fg3Pct) {
        this.fg3Pct = fg3Pct;
    }

    public void setFtm(Float ftm) {
        this.ftm = ftm;
    }

    public void setFta(Float fta) {
        this.fta = fta;
    }

    public void setFtPct(Float ftPct) {
        this.ftPct = ftPct;
    }

    public void setOreb(Float oreb) {
        this.oreb = oreb;
    }

    public void setDreb(Float dreb) {
        this.dreb = dreb;
    }

    public void setReb(Float reb) {
        this.reb = reb;
    }

    public void setAst(Float ast) {
        this.ast = ast;
    }

    public void setTov(Float tov) {
        this.tov = tov;
    }

    public void setStl(Float stl) {
        this.stl = stl;
    }

    public void setBlk(Float blk) {
        this.blk = blk;
    }

    public void setBlka(Float blka) {
        this.blka = blka;
    }

    public void setPf(Float pf) {
        this.pf = pf;
    }

    public void setPfd(Float pfd) {
        this.pfd = pfd;
    }

    public void setPts(Float pts) {
        this.pts = pts;
    }

    public void setPlusMinus(Float plusMinus) {
        this.plusMinus = plusMinus;
    }

    public void setNbaFantasyPts(Float nbaFantasyPts) {
        this.nbaFantasyPts = nbaFantasyPts;
    }

    public void setDd2(Integer dd2) {
        this.dd2 = dd2;
    }

    public void setTd3(Integer td3) {
        this.td3 = td3;
    }

    public void setWnbaFantasyPts(Float wnbaFantasyPts) {
        this.wnbaFantasyPts = wnbaFantasyPts;
    }

    public void setGpRank(Integer gpRank) {
        this.gpRank = gpRank;
    }

    public void setwRank(Integer wRank) {
        this.wRank = wRank;
    }

    public void setlRank(Integer lRank) {
        this.lRank = lRank;
    }

    public void setwPctRank(Integer wPctRank) {
        this.wPctRank = wPctRank;
    }

    public void setMinRank(Integer minRank) {
        this.minRank = minRank;
    }

    public void setFgmRank(Integer fgmRank) {
        this.fgmRank = fgmRank;
    }

    public void setFgaRank(Integer fgaRank) {
        this.fgaRank = fgaRank;
    }

    public void setFgPctRank(Integer fgPctRank) {
        this.fgPctRank = fgPctRank;
    }

    public void setFg3mRank(Integer fg3mRank) {
        this.fg3mRank = fg3mRank;
    }

    public void setFg3aRank(Integer fg3aRank) {
        this.fg3aRank = fg3aRank;
    }

    public void setFg3PctRank(Integer fg3PctRank) {
        this.fg3PctRank = fg3PctRank;
    }

    public void setFtmRank(Integer ftmRank) {
        this.ftmRank = ftmRank;
    }

    public void setFtaRank(Integer ftaRank) {
        this.ftaRank = ftaRank;
    }

    public void setFtPctRank(Integer ftPctRank) {
        this.ftPctRank = ftPctRank;
    }

    public void setOrebRank(Integer orebRank) {
        this.orebRank = orebRank;
    }

    public void setDrebRank(Integer drebRank) {
        this.drebRank = drebRank;
    }

    public void setRebRank(Integer rebRank) {
        this.rebRank = rebRank;
    }

    public void setAstRank(Integer astRank) {
        this.astRank = astRank;
    }

    public void setTovRank(Integer tovRank) {
        this.tovRank = tovRank;
    }

    public void setStlRank(Integer stlRank) {
        this.stlRank = stlRank;
    }

    public void setBlkRank(Integer blkRank) {
        this.blkRank = blkRank;
    }

    public void setBlkaRank(Integer blkaRank) {
        this.blkaRank = blkaRank;
    }

    public void setPfRank(Integer pfRank) {
        this.pfRank = pfRank;
    }

    public void setPfdRank(Integer pfdRank) {
        this.pfdRank = pfdRank;
    }

    public void setPtsRank(Integer ptsRank) {
        this.ptsRank = ptsRank;
    }

    public void setPlusMinusRank(Integer plusMinusRank) {
        this.plusMinusRank = plusMinusRank;
    }

    public void setNbaFantasyPtsRank(Integer nbaFantasyPtsRank) {
        this.nbaFantasyPtsRank = nbaFantasyPtsRank;
    }

    public void setDd2Rank(Integer dd2Rank) {
        this.dd2Rank = dd2Rank;
    }

    public void setTd3Rank(Integer td3Rank) {
        this.td3Rank = td3Rank;
    }

    public void setWnbaFantasyPtsRank(Integer wnbaFantasyPtsRank) {
        this.wnbaFantasyPtsRank = wnbaFantasyPtsRank;
    }
}


