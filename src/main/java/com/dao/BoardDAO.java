package com.dao;

import com.vo.BoardVO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
    private JdbcTemplate template;
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    private final String BOARD_INSERT = "insert into PLAYLIST (title, content, youtuber, link, views) values (?,?,?,?,?);";
    private final String BOARD_UPDATE = "update PLAYLIST set title=?, content=?, youtuber=?, link=?, views=? where seq=?";
    private final String BOARD_DELETE = "delete from PLAYLIST  where seq=?";
    private final String BOARD_GET = "select * from PLAYLIST  where seq=?";
    private final String BOARD_LIST = "select * from PLAYLIST order by seq desc";

    public int insertBoard(BoardVO vo) {
        return template.update(BOARD_INSERT, new Object[]{vo.getTitle(), vo.getContent(), vo.getYoutuber(), vo.getLink(), vo.getViews()});
    }
    // 글 삭제
    public  int deleteBoard(int id) {
        return template.update(BOARD_DELETE,
                new Object[]{id});
    }
    public int updateBoard(BoardVO vo) {
        return template.update(BOARD_UPDATE,
                new Object[]{vo.getTitle(), vo.getContent(), vo.getYoutuber(), vo.getLink(), vo.getViews(), vo.getSeq()});
    }

    public BoardVO getBoard(int seq) {
        return template.queryForObject(BOARD_GET,
                new Object[]{seq},
                new BeanPropertyRowMapper<BoardVO>(BoardVO.class));
    }

    public List<BoardVO> getBoardList() {
        return template.query(BOARD_LIST, new RowMapper<BoardVO>() {

            @Override
            public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
                BoardVO one = new BoardVO();
                one.setSeq(rs.getInt("seq"));
                one.setTitle(rs.getString("title"));
                one.setContent(rs.getString("content"));
                one.setYoutuber(rs.getString("youtuber"));
                one.setLink(rs.getString("link"));
                one.setViews(rs.getInt("views"));
                return one;
            }
        });
    }


}
