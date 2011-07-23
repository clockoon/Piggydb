package marubinotto.piggydb.ui.page.html;

import java.util.List;

import marubinotto.piggydb.model.Tag;

public class TagPaletteFlat extends AbstractTagPalette {
	
	private static final String VIEW_TYPE = "flat";
	private static final int PAGE_SIZE = 100;

	public int pi = 0;
	
	public List<Tag> tags;

	@Override 
	protected void setModels() throws Exception {
		super.setModels();
		
		this.viewType = VIEW_TYPE;
		this.tags = getDomain().getTagRepository().orderByName(PAGE_SIZE, this.pi);
	}
}
