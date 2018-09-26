let $ = require('./util.js')

module.exports = {
  EditIssue
}

async function EditIssue (client, id) {
  try {
    await client.issue.editIssue({
      issueKey: id,
      issue: {
        fields: {
          summary: 'This is a test',
          labels: [
            'bugfix',
            'blitz_test'
          ]
        }
      }
    })
  } catch (e) {
    $.Log.error(`Unable to edit JIRA issue - Status code of error is:\n${e}`)
  }
}