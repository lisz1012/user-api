package com.lisz.api;

import com.lisz.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@RequestMapping("/user")
public interface UserApi {

	/**
	 * 这里的@GetMapping @PostMapping @RequestParam 等注解是给OpenFeign看的，看到了URI之后，与客户端那个ConsumerApi接口的注释中
	 * 的"user-provider"组装成一个URL, 或者组装参数
	 */
	@GetMapping("/alive")
	public String alive();

	@GetMapping("/user/{id}")
	String getById(@PathVariable int id);

	@GetMapping("/map")
	public Map<Integer, String> getMap(@RequestParam int id); // 这里必须写@RequestParam，是给Openfeign看的 user-provider中的那个实现类可以不写，但最好都写上

	@GetMapping("/map2")
	public Map<Integer, String> getMap2(@RequestParam int id, @RequestParam String name);

	@GetMapping("/map3")
	public Map<Integer, String> getMap3(@RequestParam Map<String, Object> map);

	// 这里的参数的注解写 @RequestParam但是 provider实现里面写 @RequestBody是可以的，但反之不行，最好还是统一起来，
	// 不管是@RequestParam还是@RequestBody，统一起来肯定没问题
	@PostMapping("/map4")
	public Map<Integer, String> postMap(@RequestBody Map<String, Object> map);

	@PostMapping("/map5")
	public User postMap2(@RequestBody User user);
}
