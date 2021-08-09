package com.zhong.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.support.geo.LineString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/8/6 16:11
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Card {

	private List<String> touser;

	private List<String> toparty;

	private List<String> totag;

	private String msgtype;

	@JSONField(name = "agentid")
	private String agentId;

	@JSONField(name = "enable_id_trans")
	private Integer enableIdTrans;

	@JSONField(name = "enable_duplicate_check")
	private Integer enableDuplicateCheck;

	@JSONField(name = "duplicate_check_interval")
	private Integer duplicateCheckInterval;

//-----------------------

	@JSONField(name = "interactive_taskcard")
	private InteractiveTaskCard interactiveTaskCard;




}
